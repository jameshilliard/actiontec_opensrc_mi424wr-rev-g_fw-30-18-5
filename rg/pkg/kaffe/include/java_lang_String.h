/* DO NOT EDIT THIS FILE - it is machine generated */
#include <native.h>

#ifndef _Included_java_lang_String
#define _Included_java_lang_String

#ifdef __cplusplus
extern "C" {
#endif

/* Header for class java_lang_String */

typedef struct Hjava_lang_String {
  /* Fields from java/lang/Object: */
  Hjava_lang_Object base;

  /* Fields from java/lang/String: */
#undef java_lang_String_STRINGBUFFER_SLOP
#define java_lang_String_STRINGBUFFER_SLOP 32L
#undef java_lang_String_serialVersionUID
#define java_lang_String_serialVersionUID -6849794470754667710LL
  HArrayOfChar* value;
  jint offset;
  jint count;
  jboolean interned;
  jint hash;
} Hjava_lang_String;

extern jint java_lang_String_indexOf(struct Hjava_lang_String*, struct Hjava_lang_String*, jint);
extern struct Hjava_lang_String* java_lang_String_intern0(struct Hjava_lang_String*);

#ifdef __cplusplus
}
#endif

#endif
