/*
 * Copyright {2021} {devonline.academy}
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package Java_OOP._inheritance_and_polymorphism;

public class ThisAndSuper {
    private static class Parent {

        public Parent() {
            this(12);
        }

        public Parent(int value) {

        }
    }

    private static class Child extends Parent {

        public Child() {
        }

        public Child(int value) {
            super(value);
        }
    }
}
