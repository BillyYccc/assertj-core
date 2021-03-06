/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2018 the original author or authors.
 */
package org.assertj.core.util;

import static org.assertj.core.test.ExpectedException.none;

import org.assertj.core.test.ExpectedException;
import org.junit.Rule;
import org.junit.Test;

public class Preconditions_checkArgument_Test {

  @Rule
  public ExpectedException thrown = none();

  @Test
  public void should_throw_illegalargumentexception_if_expression_is_false() {
    thrown.expectIllegalArgumentException("Invalid parameter foo");
    Preconditions.checkArgument(false, "Invalid parameter %s", "foo");
  }

  @Test
  public void should_not_throw_if_expression_is_true() {
    Preconditions.checkArgument(true, "Invalid parameter %s", "foo");
  }
}
