/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.wayang.api.json.parserutil

import org.apache.wayang.api.json.exception.WayangApiJsonException

object ParsingErrors {
  def handleException(e: Throwable, s: String): Nothing = {
    val exceptionMessage = e.getMessage.replaceAll("\r\n|\r|\n", " ")
    val message = s"${exceptionMessage} at:\n\n" + s
    e.printStackTrace()
    println(message)
    throw new WayangApiJsonException(message)
  }
}