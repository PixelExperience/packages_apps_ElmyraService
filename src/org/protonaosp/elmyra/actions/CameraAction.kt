/*
 * Copyright (C) 2020 The Proton AOSP Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package org.protonaosp.elmyra.actions

import android.Manifest
import android.content.Context
import android.content.Intent
import android.os.UserHandle

class CameraAction(context: Context) : Action(context) {

    override fun run() {
        val intent = Intent(Intent.ACTION_SCREEN_CAMERA_GESTURE)
        context.sendBroadcastAsUser(intent, UserHandle.CURRENT, Manifest.permission.STATUS_BAR_SERVICE)
    }
}
