/*
 * Copyright 2022-2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package plus.wcj.apisix.core.customizer;

import com.fasterxml.jackson.databind.node.ObjectNode;

import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.core.annotation.Order;

/**
 * @author <a href="mailto:naown@foxmail.com">chenjian</a>
 * @author changjin wei(魏昌进)
 */
@Order(UpstreamCustomizer.DEFAULT_ORDER)
public interface UpstreamCustomizer<T extends Registration> {

	/**
	 * Order for the {@link UpstreamCustomizer}.
	 */
	int DEFAULT_ORDER = 0;

	/**
	 * create upstream init.
	 * @param registration registration meta data
	 * @param requestBody data in json format
	 */
	default void init(T registration, ObjectNode requestBody) {

	}

	/**
	 * deregister upstream node init.
	 * @param registration registration meta data
	 * @param requestBody data in json format
	 */
	default void deregister(T registration, ObjectNode requestBody) {

	}

	/**
	 * register upstream node init.
	 * @param registration registration meta data
	 * @param requestBody data in json format
	 */
	default void register(T registration, ObjectNode requestBody) {

	}

	/**
	 * modify status upstream node init.
	 * @param registration registration meta data
	 * @param status node status
	 * @param requestBody data in json format
	 */
	default void status(T registration, float status, ObjectNode requestBody) {

	}

}
