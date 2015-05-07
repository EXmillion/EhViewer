/*
 * Copyright (C) 2015 Hippo Seven
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hippo.util;

import android.support.v4.view.animation.FastOutLinearInInterpolator;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.support.v4.view.animation.LinearOutSlowInInterpolator;
import android.view.animation.Interpolator;

public final class InterpolatorUtils {

    public static final Interpolator FAST_SLOW_INTERPOLATOR = new LinearOutSlowInInterpolator();
    public static final Interpolator SLOW_FAST_INTERPOLATOR = new FastOutLinearInInterpolator();
    public static final Interpolator SLOW_FAST_SLOW_INTERPOLATOR = new FastOutSlowInInterpolator();
}
