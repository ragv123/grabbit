package com.twcable.grabbit.resources

import org.apache.sling.api.resource.ResourceResolver
import spock.lang.Specification

import static com.twcable.grabbit.resources.ContentResource.CONTENT_RESOURCE_TYPE

/*
 * Copyright 2015 Time Warner Cable, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

class ContentResourceSpec extends Specification {

    def "ContentResource is created as expected"() {
        given:
        final ContentResource contentResource = new ContentResource(Mock(ResourceResolver), "/resolution/path")

        expect:
        contentResource.getPath() == "/resolution/path"
        contentResource.getResourceType() == CONTENT_RESOURCE_TYPE
    }
}
