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

package plus.wcj.apisix.loadbalancer;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author changjin wei(魏昌进)
 */
@ConfigurationProperties("spring.cloud.apisix.gateway")
public class ApisixGatewayLoadbalancerProperties {

	/**
	 * key is client name. value is apisix gateway address.
	 */
	private Map<String, ApisixGatewayConfig> loadbalancer = new HashMap<>();

	public Map<String, ApisixGatewayConfig> getLoadbalancer() {
		return loadbalancer;
	}

	public void setLoadbalancer(Map<String, ApisixGatewayConfig> loadbalancer) {
		this.loadbalancer = loadbalancer;
	}

}
