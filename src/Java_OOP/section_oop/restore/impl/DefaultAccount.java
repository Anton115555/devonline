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

package Java_OOP.section_oop.restore.impl;

import Java_OOP.section_oop.restore.Account;

public final class DefaultAccount implements Account {

    private String email;

    private boolean active;

    private String code;

    public DefaultAccount(String email, boolean active) {
        this.email = email;
        this.active = active;
    }

    @Override
    public boolean isNotActive() {
        return !active;
    }

    @Override
    public void setCode(String code) {
        this.code = code;
    }

    public String getEmail() {
        return email;
    }
}