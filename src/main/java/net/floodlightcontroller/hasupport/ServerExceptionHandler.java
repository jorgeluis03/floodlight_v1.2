/**
 *    Licensed under the Apache License, Version 2.0 (the "License"); you may
 *    not use this file except in compliance with the License. You may obtain
 *    a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *    WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *    License for the specific language governing permissions and limitations
 *    under the License.
 **/

package net.floodlightcontroller.hasupport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;

public class ServerExceptionHandler implements ChannelHandler {

	private static final Logger logger = LoggerFactory.getLogger(ServerExceptionHandler.class);

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable exp) throws Exception {
		try {
			logger.info(exp.getMessage());
		} catch (Exception e) {
		}
	}

	@Override
	public void handlerAdded(ChannelHandlerContext arg0) throws Exception {
	}

	@Override
	public void handlerRemoved(ChannelHandlerContext arg0) throws Exception {
	}

}
