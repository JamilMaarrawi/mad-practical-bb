package at.ac.hcw.procrastinot.util

import androidx.annotation.ColorRes
import androidx.annotation.StringRes
import at.ac.hcw.procrastinot.R
import at.ac.hcw.procrastinot.data.TaskPriority

@StringRes
fun TaskPriority.labelRes(): Int = when (this) {
    TaskPriority.HIGH -> R.string.priority_high
    TaskPriority.MEDIUM -> R.string.priority_medium
    TaskPriority.LOW -> R.string.priority_low
}

@ColorRes
fun TaskPriority.colorRes(): Int = when (this) {
    TaskPriority.HIGH -> R.color.priority_high
    TaskPriority.MEDIUM -> R.color.priority_medium
    TaskPriority.LOW -> R.color.priority_low
}

