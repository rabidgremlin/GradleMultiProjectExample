package com.rabidgremlin.utillib;

import org.apache.commons.codec.digest.DigestUtils;

public class TokenUtil
{
  // silly bit of code to generate a string, using a 3rd party library
  public String getRandomToken()
  {
    return DigestUtils.sha256Hex("" + System.currentTimeMillis());
  }
}
