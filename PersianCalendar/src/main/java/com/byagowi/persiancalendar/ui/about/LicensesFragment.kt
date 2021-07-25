package com.byagowi.persiancalendar.ui.about

import android.os.Bundle
import android.text.SpannableString
import android.text.util.Linkify
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.byagowi.persiancalendar.R
import com.byagowi.persiancalendar.databinding.FragmentLicensesBinding
import com.byagowi.persiancalendar.utils.setupUpNavigation

class LicensesFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ) = FragmentLicensesBinding.inflate(inflater, container, false).also { binding ->
        binding.appBar.toolbar.let {
            it.setTitle(R.string.about_license_title)
            it.setupUpNavigation()
        }

        val text = resources.openRawResource(R.raw.credits).use { String(it.readBytes()) }
        val splitPattern = Regex("^-{4}$", RegexOption.MULTILINE)
        binding.recyclerView.adapter = ExpandableItemsAdapter(splitPattern.split(text).map {
            val lines = it.trim().lines()
            val parts = lines.first().split(" - ")
            val content = SpannableString(lines.drop(1).joinToString("\n").trim())
            Linkify.addLinks(content, Linkify.WEB_URLS or Linkify.EMAIL_ADDRESSES)
            ExpandableItemsAdapter.Item(parts[0], parts.getOrNull(1), content)
        }, isRTL = false)
        val layoutManager = LinearLayoutManager(context)
        binding.recyclerView.layoutManager = LinearLayoutManager(context)
        binding.recyclerView.addItemDecoration(
            DividerItemDecoration(context, layoutManager.orientation)
        )
    }.root
}
