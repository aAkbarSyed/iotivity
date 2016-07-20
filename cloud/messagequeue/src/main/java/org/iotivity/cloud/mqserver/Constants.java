/*
 * //******************************************************************
 * //
 * // Copyright 2016 Samsung Electronics All Rights Reserved.
 * //
 * //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
 * //
 * // Licensed under the Apache License, Version 2.0 (the "License");
 * // you may not use this file except in compliance with the License.
 * // You may obtain a copy of the License at
 * //
 * //      http://www.apache.org/licenses/LICENSE-2.0
 * //
 * // Unless required by applicable law or agreed to in writing, software
 * // distributed under the License is distributed on an "AS IS" BASIS,
 * // WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * // See the License for the specific language governing permissions and
 * // limitations under the License.
 * //
 * //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
 */
package org.iotivity.cloud.mqserver;

import org.iotivity.cloud.base.OCFConstants;

public class Constants extends OCFConstants {

    public static final String MQ_TOPIC                = "topic";
    public static final String MQ_LOCATION             = "location";
    public static final String MQ_TOPICLIST            = "topiclist";

    public static final long   MIN_SEQ_NUM             = 5;
    public static final long   MAX_SEQ_NUM             = 16777215;

    // For Kafka
    public static final int    KAFKA_SESSION_TIMEOUT   = 10000;
    public static final int    KAFKA_CONNECT_TIMEOUT   = 10000;

    public static final int    KAFKA_CONSUMMER_THREADS = 1;

    public static final String KAFKA_COMMIT_INTERVAL   = "6000";

}