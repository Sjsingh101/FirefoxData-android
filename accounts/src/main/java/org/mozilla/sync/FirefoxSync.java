/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package org.mozilla.sync;

import android.content.Context;
import org.mozilla.sync.login.InternalFirefoxSyncLoginManagerFactory;

/**
 * A collection of static functions with entry points to Firefox Sync operations.
 */
public class FirefoxSync {
    private FirefoxSync() {}

    // todo: name.
    // TODO: maybe we should throw if it's called with the same Context twice?
    public static FirefoxSyncLoginManager getLoginManager(final Context context) {
        return InternalFirefoxSyncLoginManagerFactory.internalGetLoginManager(context);
    }
}
