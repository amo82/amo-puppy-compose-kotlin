/*
 * Copyright 2020 The Android Open Source Project
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
package com.example.androiddevchallenge.model

import androidx.compose.runtime.Immutable

@Immutable // Tell Compose runtime that this object will not change so it can perform optimizations
data class Puppy(
    val id: Long,
    val name: String,
    val breed: String = "Dog",
    val sex: String = "Female",
    val thumbUrl: String,
    val thumbContentDesc: String,
    val description: String = "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit",
    val characteristic: String = "playful, active",
    val vaccinated: String = "Vaccinations up to date, spayed / neutered.",
    val good: String = "Other cats, children.",
    val trained: Boolean = true,
    val fee: Int = 70,
    val owner: String = "https://i.pravatar.cc/112?$id"
)
