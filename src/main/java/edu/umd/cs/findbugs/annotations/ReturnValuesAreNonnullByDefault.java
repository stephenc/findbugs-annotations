package edu.umd.cs.findbugs.annotations;
/*
* Licensed to the Apache Software Foundation (ASF) under one
* or more contributor license agreements.  See the NOTICE file
* distributed with this work for additional information
* regarding copyright ownership.  The ASF licenses this file
* to you under the Apache License, Version 2.0 (the
* "License"); you may not use this file except in compliance
* with the License.  You may obtain a copy of the License at
*
*  http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/

import javax.annotation.Nonnull;
import javax.annotation.meta.TypeQualifierDefault;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * This annotation can be applied to a package, class or method to indicate that the methods in that element have
 * nonnull return values by default unless there is:
 * <ul><li>An explicit nullness annotation</li>
 * <li>The method overrides a method in a superclass (in which case the annotation of the corresponding parameter in
 * the superclass applies)</li>
 * <li>there is a default annotation applied to a more tightly nested element.</li></ul>
 */
@Documented
@Nonnull
@TypeQualifierDefault(value = METHOD)
@Retention(value = RUNTIME)
@Deprecated
public @interface ReturnValuesAreNonnullByDefault {
}
