/*
 * Copyright (C) 2007-2010 Júlio Vilmar Gesser.
 * Copyright (C) 2011, 2013-2021 The JavaParser Team.
 *
 * This file is part of JavaParser.
 *
 * JavaParser can be used either under the terms of
 * a) the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 * b) the terms of the Apache License
 *
 * You should have received a copy of both licenses in LICENCE.LGPL and
 * LICENCE.APACHE. Please refer to those files for details.
 *
 * JavaParser is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 */

package com.github.javaparser.resolution.declarations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public interface ResolvedClassDeclarationTest extends ResolvedReferenceTypeDeclarationTest, ResolvedTypeParametrizableTest,
        HasAccessSpecifierTest {

    @Override
    ResolvedClassDeclaration createValue();

    @Test
    default void resolvedClassShouldBeMarkedAsClass() {
        assertTrue(createValue().isClass());
    }

    @Test
    default void getSuperClassShouldNotBeNull() {
        assertNotNull(createValue().getSuperClass());
    }

    @Test
    default void getInterfacesShouldNotBeNull() {
        assertNotNull(createValue().getInterfaces());
    }

    @Test
    default void getAllSuperClasses() {
        assertNotNull(createValue().getAllSuperClasses());
    }

    @Test
    default void getAllInterfaces() {
        assertNotNull(createValue().getAllInterfaces());
    }

}
