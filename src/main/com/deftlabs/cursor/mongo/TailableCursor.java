/**
 * Copyright 2011, Deft Labs.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.deftlabs.cursor.mongo;

// Mongo
import com.mongodb.DBObject;

/**
 * The tailable cursor interface.
 */
public interface TailableCursor {

    /**
     * Returns the next object in the cursor. This call blocks until an object
     * is available.
     * @throws InterruptedException
     */
    public DBObject nextDoc() throws InterruptedException;

    /**
     * Called to start the tailable cursor.
     */
    public void start();

    /**
     * Called to stop the tailable cursor. This causes an Interrupted exception to
     * be thrown in the nextDoc method.
     */
    public void stop();

    /**
     * Returns true if start has been called and is running properly.
     */
    public boolean isRunning();

}

