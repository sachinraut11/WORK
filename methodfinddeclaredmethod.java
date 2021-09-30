public static Method findDeclaredMethod(final Class type,
    final String methodName, final Class[] parameterTypes)
    throws NoSuchMethodException {
  Class cl = type;
  while (cl != null) {
    try {
      return cl.getDeclaredMethod(methodName, parameterTypes);
    }
    catch (NoSuchMethodException e) {
      cl = cl.getSuperclass();
    }
  }
  throw new NoSuchMethodException(methodName);
}