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

package com.example.androiddevchallenge

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.MainDestinations.PUPY_DETAIL_ID_KEY
import com.example.androiddevchallenge.ui.views.PuppyDetails
import com.example.androiddevchallenge.ui.views.Puppys

object MainDestinations {

    const val DISCOVER_ROUTE = "discover"
    const val PUPPY_DETAIL_ROUTE = "puppy"
    const val PUPY_DETAIL_ID_KEY = "pupyId"
}

@Composable
fun NavGraph(startDestination: String = MainDestinations.DISCOVER_ROUTE) {
    val navController = rememberNavController()

    val actions = remember(navController) { MainActions(navController) }
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {

        composable(MainDestinations.DISCOVER_ROUTE) {
            Puppys(selectPuppy = actions.selectCourse)
        }
        composable(
            "${MainDestinations.PUPPY_DETAIL_ROUTE}/{$PUPY_DETAIL_ID_KEY}",
            arguments = listOf(navArgument(PUPY_DETAIL_ID_KEY) { type = NavType.LongType })
        ) { backStackEntry ->
            val arguments = requireNotNull(backStackEntry.arguments)
            PuppyDetails(
                puppyId = arguments.getLong(PUPY_DETAIL_ID_KEY),
                selectPuppy = actions.selectCourse,
                upPress = actions.upPress
            )
        }
    }
}

/**
 * Models the navigation actions in the app.
 */
class MainActions(navController: NavHostController) {
    val discoverPuppy: () -> Unit = {
        navController.navigate(MainDestinations.DISCOVER_ROUTE)
    }
    val selectCourse: (Long) -> Unit = { courseId: Long ->
        navController.navigate("${MainDestinations.PUPPY_DETAIL_ROUTE}/$courseId")
    }
    val upPress: () -> Unit = {
        navController.navigateUp()
    }
}
