/*
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

package com.aliyuncs.linkwan.model.v20181230;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class RegisterKpmPublicKeyRequest extends RpcAcsRequest<RegisterKpmPublicKeyResponse> {
	
	public RegisterKpmPublicKeyRequest() {
		super("LinkWAN", "2018-12-30", "RegisterKpmPublicKey", "linkwan");
		setProtocol(ProtocolType.HTTPS);
	}

	private String publicKey;

	public String getPublicKey() {
		return this.publicKey;
	}

	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
		if(publicKey != null){
			putBodyParameter("PublicKey", publicKey);
		}
	}

	@Override
	public Class<RegisterKpmPublicKeyResponse> getResponseClass() {
		return RegisterKpmPublicKeyResponse.class;
	}

}
