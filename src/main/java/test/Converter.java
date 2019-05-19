/**
 * @(#)Converter.java, May 19, 2019.
 * <p>
 * Copyright 2019 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package test;

/**
 * @author liushuaifei
 */
@FunctionalInterface
public interface Converter<F, T> {
    T convert(F form);

    boolean equals(Object obj);
}