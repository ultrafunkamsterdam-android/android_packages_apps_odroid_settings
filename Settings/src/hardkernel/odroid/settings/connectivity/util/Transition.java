/*
 * Copyright (C) 2017 The Android Open Source Project
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
 * limitations under the License.
 */


package hardkernel.odroid.settings.connectivity.util;

/**
 * Class representing transition between two {@link State}.
 */
public class Transition {
    public State source;
    public @StateMachine.Event int event;
    public State destination;

    public Transition(State source, @StateMachine.Event int event, State destination) {
        this.source = source;
        this.event = event;
        this.destination = destination;
    }
}