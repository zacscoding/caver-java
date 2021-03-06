/*
 * Copyright 2019 The caver-java Authors
 *
 * Licensed under the Apache License, Version 2.0 (the “License”);
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an “AS IS” BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.klaytn.caver.tx.exception;

import com.klaytn.caver.CaverException;
import com.klaytn.caver.ErrorType;
import org.web3j.protocol.core.Response;

/**
 * @deprecated This class is deprecated since caver-java:1.5.0
 */
@Deprecated
public class PlatformErrorException extends CaverException {
    public PlatformErrorException(Response.Error error) {
        super(ErrorType.PLATFORM, error.getCode(), error.getMessage());
    }
}
