/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package mozilla.components.service.experiments

import mozilla.components.concept.fetch.Client
import mozilla.components.lib.fetch.httpurlconnection.HttpURLConnectionClient

/**
 * The Configuration class describes how to configure Experiments.
 *
 * @property httpClient The HTTP client implementation to use for uploading pings.
 */
data class Configuration(
    val httpClient: Lazy<Client> = lazy { HttpURLConnectionClient() }
)
