public static void isNotNull(Object object, String errorCode, String errorMessage) {
        if (object == null) {
            throw new BizException(errorCode, errorMessage);
        }
    }

    public static void isNull(Object object, String errorCode, String errorMessage) {
        if (object != null) {
            throw new BizException(errorCode, errorMessage);
        }
    }

    public static void isNotNull(Object object, String errorMessage) {
        isNotNull(object, null, errorMessage);
    }

    public static void isNull(Object object, String errorMessage) {
        isNull(object, null, errorMessage);
    }

    public static void isNotNull(Object object, BaseEnum<?> sysErrorCodeEnum) {
        isNotNull(object, sysErrorCodeEnum.getCode().toString(), sysErrorCodeEnum.getDesc());
    }

    public static void isNull(Object object, BaseEnum<?> sysErrorCodeEnum) {
        isNull(object, sysErrorCodeEnum.getCode().toString(), sysErrorCodeEnum.getDesc());
    }


    public static void isTrue(boolean expression, String errorCode, String errorMessage) {
        if (!expression) {
            throw new BizException(errorCode, errorMessage);
        }
    }

    public static void isFalse(boolean expression, String errorCode, String errorMessage) {
        if (expression) {
            throw new BizException(errorCode, errorMessage);
        }
    }

    public static void isTrue(boolean expression, String errorMessage) {
        isTrue(expression, null, errorMessage);
    }

    public static void isFalse(boolean expression, String errorMessage) {
        isFalse(expression, null, errorMessage);
    }

    public static void isTrue(boolean expression, BaseEnum<?> sysErrorCodeEnum) {
        isTrue(expression, sysErrorCodeEnum.getCode().toString(), sysErrorCodeEnum.getDesc());
    }

    public static void isFalse(boolean expression, BaseEnum<?> sysErrorCodeEnum) {
        isFalse(expression, sysErrorCodeEnum.getCode().toString(), sysErrorCodeEnum.getDesc());
    }


    public static void isNotBlank(String text, String errorCode, String errorMessage) {
        if (StringUtils.isBlank(text)) {
            throw new BizException(errorCode, errorMessage);
        }
    }

    public static void isBlank(String text, String errorCode, String errorMessage) {
        if (!StringUtils.isBlank(text)) {
            throw new BizException(errorCode, errorMessage);
        }
    }

    public static void isNotBlank(String text, String errorMessage) {
        isNotBlank(text, null, errorMessage);
    }

    public static void isBlank(String text, String errorMessage) {
        isBlank(text, null, errorMessage);
    }

    public static void isNotBlank(String text, BaseEnum<?> sysErrorCodeEnum) {
        isNotBlank(text, sysErrorCodeEnum.getCode().toString(), sysErrorCodeEnum.getDesc());
    }

    public static void isBlank(String text, BaseEnum<?> sysErrorCodeEnum) {
        isBlank(text, sysErrorCodeEnum.getCode().toString(), sysErrorCodeEnum.getDesc());
    }


    public static void isNotEmpty(Collection<?> collection, String errorCode, String errorMessage) {
        if (CollectionUtils.isEmpty(collection)) {
            throw new BizException(errorCode, errorMessage);
        }
    }

    public static void isEmpty(Collection<?> collection, String errorCode, String errorMessage) {
        if (!CollectionUtils.isEmpty(collection)) {
            throw new BizException(errorCode, errorMessage);
        }
    }

    public static void isNotEmpty(Collection<?> collection, String errorMessage) {
        isNotEmpty(collection, null, errorMessage);
    }

    public static void isEmpty(Collection<?> collection, String errorMessage) {
        isEmpty(collection, null, errorMessage);
    }

    public static void isNotEmpty(Collection<?> collection, BaseEnum<?> sysErrorCodeEnum) {
        isNotEmpty(collection, sysErrorCodeEnum.getCode().toString(), sysErrorCodeEnum.getDesc());
    }

    public static void isEmpty(Collection<?> collection, BaseEnum<?> sysErrorCodeEnum) {
        isEmpty(collection, sysErrorCodeEnum.getCode().toString(), sysErrorCodeEnum.getDesc());
    }


    public static void isNotEmpty(Map<?, ?> map, String errorCode, String errorMessage) {
        if (CollectionUtils.isEmpty(map)) {
            throw new BizException(errorCode, errorMessage);
        }
    }

    public static void isEmpty(Map<?, ?> map, String errorCode, String errorMessage) {
        if (!CollectionUtils.isEmpty(map)) {
            throw new BizException(errorCode, errorMessage);
        }
    }

    public static void isNotEmpty(Map<?, ?> map, String errorMessage) {
        isNotEmpty(map, null, errorMessage);
    }

    public static void isEmpty(Map<?, ?> map, String errorMessage) {
        isEmpty(map, null, errorMessage);
    }

    public static void isNotEmpty(Map<?, ?> map, BaseEnum<?> sysErrorCodeEnum) {
        isNotEmpty(map, sysErrorCodeEnum.getCode().toString(), sysErrorCodeEnum.getDesc());
    }

    public static void isEmpty(Map<?, ?> map, BaseEnum<?> sysErrorCodeEnum) {
        isEmpty(map, sysErrorCodeEnum.getCode().toString(), sysErrorCodeEnum.getDesc());
    }


    public static void isNotEmpty(Object[] array, String errorCode, String errorMessage) {
        if (ObjectUtils.isEmpty(array)) {
            throw new BizException(errorCode, errorMessage);
        }
    }

    public static void isEmpty(Object[] array, String errorCode, String errorMessage) {
        if (!ObjectUtils.isEmpty(array)) {
            throw new BizException(errorCode, errorMessage);
        }
    }

    public static void isNotEmpty(Object[] array, String errorMessage) {
        isNotEmpty(array, null, errorMessage);
    }

    public static void isEmpty(Object[] array, String errorMessage) {
        isEmpty(array, null, errorMessage);
    }

    public static void isNotEmpty(Object[] array, BaseEnum<?> sysErrorCodeEnum) {
        isNotEmpty(array, sysErrorCodeEnum.getCode().toString(), sysErrorCodeEnum.getDesc());
    }

    public static void isEmpty(Object[] array, BaseEnum<?> sysErrorCodeEnum) {
        isEmpty(array, sysErrorCodeEnum.getCode().toString(), sysErrorCodeEnum.getDesc());
    }


    public static void isInstanceOf(Object obj, Class<?> type, String errorCode, String errorMessage) {
        isNotNull(obj, errorCode, errorMessage);
        if (!type.isInstance(obj)) {
            throw new BizException(errorCode, errorMessage);
        }
    }

    public static void isInstanceOf(Object obj, Class<?> type, String errorMessage) {
        isInstanceOf(obj, type, null, errorMessage);
    }

    public static void isInstanceOf(Object obj, Class<?> type, BaseEnum<?> sysErrorCodeEnum) {
        isInstanceOf(obj, type, sysErrorCodeEnum.getCode().toString(), sysErrorCodeEnum.getDesc());
    }

    public static void isContains(CharSequence seq, CharSequence searchSeq, String errorCode, String errorMessage) {
        isTrue(StringUtils.isNotBlank(seq) && StringUtils.isNotBlank(searchSeq), errorCode, errorMessage);
        if (!StringUtils.contains(seq, searchSeq)) {
            throw new BizException(errorCode, errorMessage);
        }
    }

    public static void isContains(CharSequence seq, CharSequence searchSeq, BaseEnum<?> sysErrorCodeEnum) {
        isContains(seq, searchSeq, sysErrorCodeEnum.getCode().toString(), sysErrorCodeEnum.getDesc());
    }

    public static void isContains(CharSequence seq, CharSequence searchSeq, String errorMessage) {
        isContains(seq, searchSeq, null, errorMessage);
    }

    public static void isSuccess(Result<?> result, String errorCode, String errorMessage) {
        if (result == null || !result.isSuccess()) {
            throw new BizException(errorCode, errorMessage);
        }
    }

    public static void isSuccess(Result<?> result, String errorMessage) {
        isSuccess(result, null, errorMessage);
    }

    public static void isSuccess(Result<?> result, BaseEnum<?> sysErrorCodeEnum) {
        isSuccess(result, sysErrorCodeEnum.getCode().toString(), sysErrorCodeEnum.getDesc());
    }

    public static void isSuccess(String jsonResult, String errorCode, String errorMessage) {
        Result<Object> result = JSON.parseObject(jsonResult, new TypeReference<Result<Object>>() {});
        isSuccess(result, errorCode, errorMessage);
    }

    public static void isSuccess(String jsonResult, String errorMessage) {
        isSuccess(jsonResult, null, errorMessage);
    }

    public static void isSuccess(String jsonResult, BaseEnum<?> sysErrorCodeEnum) {
        isSuccess(jsonResult, sysErrorCodeEnum.getCode().toString(), sysErrorCodeEnum.getDesc());
    }

    public static void isEquals(Object source, Object target, String errorCode, String errorMessage) {
        isTrue(Objects.equals(source, target), errorCode, errorMessage);
    }

    public static void isEquals(Object source, Object target, String errorMessage) {
        isEquals(source, target, null, errorMessage);
    }

    public static void isEquals(Object source, Object target, BaseEnum<?> sysErrorCodeEnum) {
        isEquals(source, target, sysErrorCodeEnum.getCode().toString(), sysErrorCodeEnum.getDesc());
    }

    public static void isNotEquals(Object source, Object target, String errorCode, String errorMessage) {
        isFalse(Objects.equals(source, target), errorCode, errorMessage);
    }

    public static void isNotEquals(Object source, Object target, String errorMessage) {
        isNotEquals(source, target, null, errorMessage);
    }

    public static void isNotEquals(Object source, Object target, BaseEnum<?> sysErrorCodeEnum) {
        isNotEquals(source, target, sysErrorCodeEnum.getCode().toString(), sysErrorCodeEnum.getDesc());
    }

    public static void isSuccess(String jsonResult) {
        Result<Object> result = JSON.parseObject(jsonResult, new TypeReference<Result<Object>>() {
        });
        isSuccess(result);
    }

    public static void isSuccess(Result<?> result) {
        isNotNull(result, SystemStatusEnum.BUSINESS_ERROR);
        if (!result.isSuccess()) {
            throw new BizException(result.getErrorCode(), result.getErrorMessage());
        }
    }

    /**
     * isSuccess扩展,null返回调用错误信息,success=false返回调用的错误码和错误信息
     *
     * @param result
     * @param errorMessage
     */
    public static void isSuccessExt(Result<?> result, String errorMessage) {
        isNotNull(result, errorMessage);
        if (!result.isSuccess()) {
            throw new BizException(result.getErrorCode(), result.getErrorMessage());
        }
    }

    public static void isSuccessExt(String jsonResult, String errorMessage) {
        Result<Objects> result = JSON.parseObject(jsonResult, new TypeReference<Result<Objects>>() {
        });
        isSuccessExt(result, errorMessage);
    }

    public static void allNotBlank(BaseEnum<?> sysErrorCodeEnum, String... text) {
        allNotBlank(sysErrorCodeEnum.getCode().toString(), sysErrorCodeEnum.getDesc(), text);
    }

    public static void allNotBlank(String errorCode, String errorMessage, String... text) {
        if (!StringUtils.isAnyBlank(text)) {
            throw new BizException(errorCode, errorMessage);
        }
    }
