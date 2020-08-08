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

import java.util.List;

/**
 *  Declares the functionality of the notifications service.
 */
public interface NotificationsService {

  /**
   * Sends a message to the required notification group.
   *
   * @param notificationGroupName name of the notification group
   * @param notification  notification parameters object
   */
  void sendToNotificationGroup(String notificationGroupName, Notification notification);

  /**
   * Returns a list of notification groups registered in the message service.
   *
   * @return the list of notification groups
   */
  List<String> getNotificationGroupNames();

  /**
   * Checks whether the group exists.
   *
   * @param groupName notification group name
   * @return is group exists
   */
  boolean containsNotificationGroup(String groupName);
}
