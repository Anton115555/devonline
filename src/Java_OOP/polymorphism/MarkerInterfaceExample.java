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

public class MarkerInterfaceExample implements Cloneable {

    public static void main(String[] args) throws CloneNotSupportedException {
        MarkerInterfaceExample o1 = new MarkerInterfaceExample();
        Object o2 = o1.clone();

        System.out.println(o1);
        System.out.println(o2);
    }
}
