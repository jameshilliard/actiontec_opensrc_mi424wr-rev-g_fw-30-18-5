/* DO NOT EDIT THIS FILE - it is machine generated */
#include <native.h>

#ifndef _Included_java_net_InetSocketAddress
#define _Included_java_net_InetSocketAddress

#ifdef __cplusplus
extern "C" {
#endif

/* Header for class java_net_InetSocketAddress */

typedef struct Hjava_net_InetSocketAddress {
  /* Fields from java/lang/Object: */
  Hjava_lang_Object base;

  /* Fields from java/net/SocketAddress: */
#undef java_net_InetSocketAddress_serialVersionUID
#define java_net_InetSocketAddress_serialVersionUID 5215720748342549866LL

  /* Fields from java/net/InetSocketAddress: */
#undef java_net_InetSocketAddress_serialVersionUID
#define java_net_InetSocketAddress_serialVersionUID 5076001401234631237LL
  struct Hjava_lang_String* hostname;
  struct Hjava_net_InetAddress* addr;
  jint port;
} Hjava_net_InetSocketAddress;


#ifdef __cplusplus
}
#endif

#endif
