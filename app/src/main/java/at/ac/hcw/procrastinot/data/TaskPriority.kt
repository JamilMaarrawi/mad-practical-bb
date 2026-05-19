package at.ac.hcw.procrastinot.data

enum class TaskPriority(val level: Int) {
    LOW(0),
    MEDIUM(1),
    HIGH(2);

    companion object {
        fun fromLevel(level: Int): TaskPriority = when (level) {
            HIGH.level -> HIGH
            LOW.level -> LOW
            else -> MEDIUM
        }
    }
}
