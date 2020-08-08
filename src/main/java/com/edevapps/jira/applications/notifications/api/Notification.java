/*
 *     Copyright (c) 2020, The Eduard Burenkov. All rights reserved. http://edevapps.com
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */

package com.edevapps.jira.applications.notifications.api;

import java.io.Serializable;

/**
 * Class of options of the notification.
 */
public final class Notification implements Serializable {

  private static final long serialVersionUID = 2810385098575082076L;

  private static final String EMPTY_STRING = "";

  private final String name;
  private final String message;

  /**
   * Constructor.
   *
   * @param name     name of the notification
   * @param message  message text
   */
  public Notification(String name, String message) {
    this.name = requireNonNullOrEmpty(name, "name");
    this.message = message;
  }

  /**
   * Returns a name of the notification.
   *
   * @return name of the notification
   */
  public String getName() {
    return name;
  }

  /**
   * Returns a message text.
   *
   * @return message text
   */
  public String getMessage() {
    return message;
  }

  /**
   * Returns a new class object.
   *
   * @param name  name of the notification
   * @param message message text
   * @return  the class object
   */
  public static Notification createInstance(String name, String message) {
    return new Notification(name, message);
  }

  private String requireNonNullOrEmpty(String argument, String name)
      throws IllegalArgumentException {
    if (argument == null || argument.equals(EMPTY_STRING)) {
      throw new IllegalArgumentException(String.format("The %s is not be null or empty.", name));
    }
    return argument;
  }
}
