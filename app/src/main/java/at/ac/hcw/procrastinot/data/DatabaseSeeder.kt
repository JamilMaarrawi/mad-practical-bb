/*
 * Copyright 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package at.ac.hcw.procrastinot.data

import at.ac.hcw.procrastinot.data.source.local.LocalTask

/**
 * Initial tasks inserted into the database when it is first created.
 *
 * Seeding is triggered by Room's [androidx.room.RoomDatabase.Callback.onCreate], which Room
 * calls automatically the first time the database file is created on disk — i.e. on a fresh
 * install or after the user clears the app's storage. It is never called on subsequent launches
 * as long as the database file already exists, so user-created tasks are never overwritten.
 */
internal val seedTasks: List<LocalTask> = listOf(
    LocalTask(
        id = "seed-1",
        title = "Buy groceries",
        description = "Milk, eggs, bread, and coffee",
        isCompleted = false,
    ),
    LocalTask(
        id = "seed-2",
        title = "Read a book",
        description = "Finish the chapter you started last week",
        isCompleted = false,
    ),
    LocalTask(
        id = "seed-3",
        title = "Go for a walk",
        description = "At least 30 minutes outside",
        isCompleted = false,
    ),
    LocalTask(
        id = "seed-4",
        title = "Write unit tests",
        description = "Cover the repository and ViewModel layers",
        isCompleted = false,
    ),
    LocalTask(
        id = "seed-5",
        title = "Clean the desk",
        description = "Tidy up the workspace before starting to code",
        isCompleted = false,
    ),
)
