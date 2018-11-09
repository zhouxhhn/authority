/*
 * (C) Copyright 2018 Siyue Holding Group.
 */
package cn.siyue.platform.authority.server.constants;

public enum AuthorityType {

  SALES_URL("sales", "经销商url"),
  SIYUELI_URL("siyueli", "斯越里url"),
  PERMISSION_URL("PERMISSION_URL", "权限标志"),
  SALES_PERMISSION_FLAG("SALES_PERMISSION_FLAG", "权限标志"),
  SIYUELI_PERMISSION_FLAG("SIYUELI_PERMISSION_FLAG", "权限标志"),
  REDIS_USER_SESSION("REDIS_USER_SESSION", "用户token标志");

  private String value;

  private String description;

  AuthorityType(String value, String description) {
    this.value = value;
    this.description = description;
  }

  public String getValue() {
    return value;
  }

  public String getDescription() {
    return description;
  }

  public static Boolean contains(String value) {
    if (value == null) {
      return false;
    }
    for (AuthorityType status : AuthorityType.values()) {
      if (status.getValue().equals(value)) {
        return true;
      }
    }
    return false;
  }
}
