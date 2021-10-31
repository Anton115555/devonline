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

package Java_OOP.section_oop;

import java.math.BigDecimal;

public class Product {

    private String name;

    private String description;

    private BigDecimal price;

    public Product(String name, String description, BigDecimal price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public void setName(String name) {
        if (!name.isBlank()) {
            this.name = name;
        }
    }

    public void setDescription(String description) {
        if (!description.isBlank()) {
            this.description = description;
        }
    }

    /*public void setPrice(BigDecimal price) {
        if (price.compareTo(BigDecimal.ZERO) > 0) {
            this.price = price;
        }
    }*/

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        if (isNowWeekend()) {
            return price.multiply(new BigDecimal("1.15"));
        } else {
            return price;
        }
    }

    private boolean isNowWeekend() {
        return false;
    }
}