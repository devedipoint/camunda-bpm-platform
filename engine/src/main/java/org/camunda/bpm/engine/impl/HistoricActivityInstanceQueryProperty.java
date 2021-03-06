/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.camunda.bpm.engine.impl;

import org.camunda.bpm.engine.history.HistoricActivityInstanceQuery;
import org.camunda.bpm.engine.query.QueryProperty;


/**
 * Contains the possible properties which can be used in a {@link HistoricActivityInstanceQuery}.
 *
 * @author Tom Baeyens
 */
public interface HistoricActivityInstanceQueryProperty {

  public static final QueryProperty HISTORIC_ACTIVITY_INSTANCE_ID = new QueryPropertyImpl("ID_");
  public static final QueryProperty PROCESS_INSTANCE_ID = new QueryPropertyImpl("PROC_INST_ID_");
  public static final QueryProperty EXECUTION_ID = new QueryPropertyImpl("EXECUTION_ID_");
  public static final QueryProperty ACTIVITY_ID = new QueryPropertyImpl("ACT_ID_");
  public static final QueryProperty ACTIVITY_NAME = new QueryPropertyImpl("ACT_NAME_");
  public static final QueryProperty ACTIVITY_TYPE = new QueryPropertyImpl("ACT_TYPE_");
  public static final QueryProperty PROCESS_DEFINITION_ID = new QueryPropertyImpl("PROC_DEF_ID_");
  public static final QueryProperty START = new QueryPropertyImpl("START_TIME_");
  public static final QueryProperty END = new QueryPropertyImpl("END_TIME_");
  public static final QueryProperty DURATION = new QueryPropertyImpl("DURATION_");
  public static final QueryProperty SEQUENCE_COUNTER = new QueryPropertyImpl("SEQUENCE_COUNTER_");
}
