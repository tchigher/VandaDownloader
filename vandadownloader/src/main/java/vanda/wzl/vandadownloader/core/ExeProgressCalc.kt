/*
 * Copyright (c) 2018 YY Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package vanda.wzl.vandadownloader.core

import vanda.wzl.vandadownloader.core.database.RemarkPointSql
import vanda.wzl.vandadownloader.core.progress.ProgressData

interface ExeProgressCalc : RemarkPointSql {
    fun exeProgressCalc(): Long
    fun allComplete(): Boolean
    fun speedIncrement(): Long
    fun sofar(curThreadId: Int): Long
    fun pauseComplete(curThreadId: Int)
    fun allPauseComplete(): Boolean
    fun proProgressData(progressData: ProgressData)
}