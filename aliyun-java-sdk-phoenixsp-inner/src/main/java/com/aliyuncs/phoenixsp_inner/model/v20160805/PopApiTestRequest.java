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

package com.aliyuncs.phoenixsp_inner.model.v20160805;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class PopApiTestRequest extends RpcAcsRequest<PopApiTestResponse> {
	
	public PopApiTestRequest() {
		super("Phoenixsp-inner", "2016-08-05", "PopApiTest");
	}

	private String userName;

	private String pwd;

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		if(userName != null){
			putQueryParameter("userName", userName);
		}
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
		if(pwd != null){
			putQueryParameter("pwd", pwd);
		}
	}

	@Override
	public Class<PopApiTestResponse> getResponseClass() {
		return PopApiTestResponse.class;
	}

}
