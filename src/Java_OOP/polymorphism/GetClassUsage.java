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

package Java_OOP.polymorphism;

public class GetClassUsage {
    public static void main(String[] args) {
        Object o1 = new Child();
        Object o2 = null;

        // instanceof
        // 1) Supports parent classes
        System.out.println(o1 instanceof Parent);
        // 2) Supports null
        System.out.println(o2 instanceof Parent);

        System.out.println("------------------------");

        // getClass
        // 1) Does not support parent classes
        System.out.println(o1.getClass() == Parent.class);
        // 2) Does not support null
        System.out.println(o2.getClass() == Parent.class);
    }

    private static class Parent /*extends Object*/ {

    }

    private static class Child extends Parent {

    }
}
