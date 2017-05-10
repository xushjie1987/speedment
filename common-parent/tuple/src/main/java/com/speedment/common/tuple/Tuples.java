/**
 * 
 * Copyright (c) 2006-2017, Speedment, Inc. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at: 
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.speedment.common.tuple;

import com.speedment.common.tuple.internal.nonnullable.Tuple0Impl;
import com.speedment.common.tuple.internal.nonnullable.Tuple10Impl;
import com.speedment.common.tuple.internal.nonnullable.Tuple11Impl;
import com.speedment.common.tuple.internal.nonnullable.Tuple12Impl;
import com.speedment.common.tuple.internal.nonnullable.Tuple13Impl;
import com.speedment.common.tuple.internal.nonnullable.Tuple14Impl;
import com.speedment.common.tuple.internal.nonnullable.Tuple15Impl;
import com.speedment.common.tuple.internal.nonnullable.Tuple16Impl;
import com.speedment.common.tuple.internal.nonnullable.Tuple17Impl;
import com.speedment.common.tuple.internal.nonnullable.Tuple18Impl;
import com.speedment.common.tuple.internal.nonnullable.Tuple19Impl;
import com.speedment.common.tuple.internal.nonnullable.Tuple1Impl;
import com.speedment.common.tuple.internal.nonnullable.Tuple20Impl;
import com.speedment.common.tuple.internal.nonnullable.Tuple21Impl;
import com.speedment.common.tuple.internal.nonnullable.Tuple22Impl;
import com.speedment.common.tuple.internal.nonnullable.Tuple23Impl;
import com.speedment.common.tuple.internal.nonnullable.Tuple2Impl;
import com.speedment.common.tuple.internal.nonnullable.Tuple3Impl;
import com.speedment.common.tuple.internal.nonnullable.Tuple4Impl;
import com.speedment.common.tuple.internal.nonnullable.Tuple5Impl;
import com.speedment.common.tuple.internal.nonnullable.Tuple6Impl;
import com.speedment.common.tuple.internal.nonnullable.Tuple7Impl;
import com.speedment.common.tuple.internal.nonnullable.Tuple8Impl;
import com.speedment.common.tuple.internal.nonnullable.Tuple9Impl;
import com.speedment.common.tuple.internal.nonnullable.mapper.Tuple0MapperImpl;
import com.speedment.common.tuple.internal.nonnullable.mapper.Tuple10MapperImpl;
import com.speedment.common.tuple.internal.nonnullable.mapper.Tuple11MapperImpl;
import com.speedment.common.tuple.internal.nonnullable.mapper.Tuple12MapperImpl;
import com.speedment.common.tuple.internal.nonnullable.mapper.Tuple13MapperImpl;
import com.speedment.common.tuple.internal.nonnullable.mapper.Tuple14MapperImpl;
import com.speedment.common.tuple.internal.nonnullable.mapper.Tuple15MapperImpl;
import com.speedment.common.tuple.internal.nonnullable.mapper.Tuple16MapperImpl;
import com.speedment.common.tuple.internal.nonnullable.mapper.Tuple17MapperImpl;
import com.speedment.common.tuple.internal.nonnullable.mapper.Tuple18MapperImpl;
import com.speedment.common.tuple.internal.nonnullable.mapper.Tuple19MapperImpl;
import com.speedment.common.tuple.internal.nonnullable.mapper.Tuple1MapperImpl;
import com.speedment.common.tuple.internal.nonnullable.mapper.Tuple20MapperImpl;
import com.speedment.common.tuple.internal.nonnullable.mapper.Tuple21MapperImpl;
import com.speedment.common.tuple.internal.nonnullable.mapper.Tuple22MapperImpl;
import com.speedment.common.tuple.internal.nonnullable.mapper.Tuple23MapperImpl;
import com.speedment.common.tuple.internal.nonnullable.mapper.Tuple2MapperImpl;
import com.speedment.common.tuple.internal.nonnullable.mapper.Tuple3MapperImpl;
import com.speedment.common.tuple.internal.nonnullable.mapper.Tuple4MapperImpl;
import com.speedment.common.tuple.internal.nonnullable.mapper.Tuple5MapperImpl;
import com.speedment.common.tuple.internal.nonnullable.mapper.Tuple6MapperImpl;
import com.speedment.common.tuple.internal.nonnullable.mapper.Tuple7MapperImpl;
import com.speedment.common.tuple.internal.nonnullable.mapper.Tuple8MapperImpl;
import com.speedment.common.tuple.internal.nonnullable.mapper.Tuple9MapperImpl;
import com.speedment.common.tuple.nonnullable.Tuple0;
import com.speedment.common.tuple.nonnullable.Tuple10;
import com.speedment.common.tuple.nonnullable.Tuple11;
import com.speedment.common.tuple.nonnullable.Tuple12;
import com.speedment.common.tuple.nonnullable.Tuple13;
import com.speedment.common.tuple.nonnullable.Tuple14;
import com.speedment.common.tuple.nonnullable.Tuple15;
import com.speedment.common.tuple.nonnullable.Tuple16;
import com.speedment.common.tuple.nonnullable.Tuple17;
import com.speedment.common.tuple.nonnullable.Tuple18;
import com.speedment.common.tuple.nonnullable.Tuple19;
import com.speedment.common.tuple.nonnullable.Tuple1;
import com.speedment.common.tuple.nonnullable.Tuple20;
import com.speedment.common.tuple.nonnullable.Tuple21;
import com.speedment.common.tuple.nonnullable.Tuple22;
import com.speedment.common.tuple.nonnullable.Tuple23;
import com.speedment.common.tuple.nonnullable.Tuple2;
import com.speedment.common.tuple.nonnullable.Tuple3;
import com.speedment.common.tuple.nonnullable.Tuple4;
import com.speedment.common.tuple.nonnullable.Tuple5;
import com.speedment.common.tuple.nonnullable.Tuple6;
import com.speedment.common.tuple.nonnullable.Tuple7;
import com.speedment.common.tuple.nonnullable.Tuple8;
import com.speedment.common.tuple.nonnullable.Tuple9;
import java.util.function.Function;

/**
 * A collection of static methods to produce different types of {@link Tuple }
 * objects
 * 
 * @author Per Minborg
 */
public final class Tuples {
    
    private Tuples() {
        throw new UnsupportedOperationException();
    }
    
    /**
     * Creates and returns a {@link Tuple0} with the given parameters.
     * 
     * @return a {@link Tuple0} with the given parameters.
     * 
     * @see Tuple0
     * @see Tuple
     */
    public static Tuple0 of() {
        return Tuple0Impl.EMPTY_TUPLE;
    }
    
    /**
     * Creates and returns a Function that, when applied, creates a {@link
     * Tuple0} from an initial object of type T by applying the given mappers.
     * 
     * @param <T> type of the initial object to be used by the function to
     *            create a {@link Tuple0 }
     * @return    a Function that, when applied, creates a {@link Tuple0} from
     *            an initial object of type T by applying the given mappers.
     * 
     * @see Tuple0
     * @see Tuple
     */
    @SuppressWarnings("unchecked")
    public static <T> Function<T, Tuple0> toTuple() {
        return (Function<T, Tuple0>) Tuple0MapperImpl.EMPTY_MAPPER;
    }
    
    /**
     * Creates and returns a {@link Tuple1} with the given parameters.
     * 
     * @param <T0> type of element 0
     * @param e0   element 0
     * @return     a {@link Tuple1} with the given parameters.
     * 
     * @see Tuple1
     * @see Tuple
     */
    public static <T0> Tuple1<T0> of(T0 e0) {
        return new Tuple1Impl<>(e0);
    }
    
    /**
     * Creates and returns a Function that, when applied, creates a {@link
     * Tuple1} from an initial object of type T by applying the given mappers.
     * 
     * @param <T>  type of the initial object to be used by the function to
     *             create a {@link Tuple1 }
     * @param <T0> target type of m0
     * @param m0   mapper to apply for Tuple1's element 0
     * @return     a Function that, when applied, creates a {@link Tuple1} from
     *             an initial object of type T by applying the given mappers.
     * 
     * @see Tuple1
     * @see Tuple
     */
    public static <T, T0> Function<T, Tuple1<T0>> toTuple(Function<T, T0> m0) {
        return new Tuple1MapperImpl<>(m0);
    }
    
    /**
     * Creates and returns a {@link Tuple2} with the given parameters.
     * 
     * @param <T0> type of element 0
     * @param <T1> type of element 1
     * @param e0   element 0
     * @param e1   element 1
     * @return     a {@link Tuple2} with the given parameters.
     * 
     * @see Tuple2
     * @see Tuple
     */
    public static <T0, T1> Tuple2<T0, T1> of(T0 e0, T1 e1) {
        return new Tuple2Impl<>(e0, e1);
    }
    
    /**
     * Creates and returns a Function that, when applied, creates a {@link
     * Tuple2} from an initial object of type T by applying the given mappers.
     * 
     * @param <T>  type of the initial object to be used by the function to
     *             create a {@link Tuple2 }
     * @param <T0> target type of m0
     * @param <T1> target type of m1
     * @param m0   mapper to apply for Tuple2's element 0
     * @param m1   mapper to apply for Tuple2's element 1
     * @return     a Function that, when applied, creates a {@link Tuple2} from
     *             an initial object of type T by applying the given mappers.
     * 
     * @see Tuple2
     * @see Tuple
     */
    public static <T, T0, T1> Function<T, Tuple2<T0, T1>> toTuple(Function<T, T0> m0, Function<T, T1> m1) {
        return new Tuple2MapperImpl<>(m0, m1);
    }
    
    /**
     * Creates and returns a {@link Tuple3} with the given parameters.
     * 
     * @param <T0> type of element 0
     * @param <T1> type of element 1
     * @param <T2> type of element 2
     * @param e0   element 0
     * @param e1   element 1
     * @param e2   element 2
     * @return     a {@link Tuple3} with the given parameters.
     * 
     * @see Tuple3
     * @see Tuple
     */
    public static <T0, T1, T2> Tuple3<T0, T1, T2> of(T0 e0, T1 e1, T2 e2) {
        return new Tuple3Impl<>(e0, e1, e2);
    }
    
    /**
     * Creates and returns a Function that, when applied, creates a {@link
     * Tuple3} from an initial object of type T by applying the given mappers.
     * 
     * @param <T>  type of the initial object to be used by the function to
     *             create a {@link Tuple3 }
     * @param <T0> target type of m0
     * @param <T1> target type of m1
     * @param <T2> target type of m2
     * @param m0   mapper to apply for Tuple3's element 0
     * @param m1   mapper to apply for Tuple3's element 1
     * @param m2   mapper to apply for Tuple3's element 2
     * @return     a Function that, when applied, creates a {@link Tuple3} from
     *             an initial object of type T by applying the given mappers.
     * 
     * @see Tuple3
     * @see Tuple
     */
    public static <T, T0, T1, T2> Function<T, Tuple3<T0, T1, T2>> toTuple(Function<T, T0> m0, Function<T, T1> m1, Function<T, T2> m2) {
        return new Tuple3MapperImpl<>(m0, m1, m2);
    }
    
    /**
     * Creates and returns a {@link Tuple4} with the given parameters.
     * 
     * @param <T0> type of element 0
     * @param <T1> type of element 1
     * @param <T2> type of element 2
     * @param <T3> type of element 3
     * @param e0   element 0
     * @param e1   element 1
     * @param e2   element 2
     * @param e3   element 3
     * @return     a {@link Tuple4} with the given parameters.
     * 
     * @see Tuple4
     * @see Tuple
     */
    public static <T0, T1, T2, T3> Tuple4<T0, T1, T2, T3> of(
            T0 e0,
            T1 e1,
            T2 e2,
            T3 e3) {
        return new Tuple4Impl<>(e0, e1, e2, e3);
    }
    
    /**
     * Creates and returns a Function that, when applied, creates a {@link
     * Tuple4} from an initial object of type T by applying the given mappers.
     * 
     * @param <T>  type of the initial object to be used by the function to
     *             create a {@link Tuple4 }
     * @param <T0> target type of m0
     * @param <T1> target type of m1
     * @param <T2> target type of m2
     * @param <T3> target type of m3
     * @param m0   mapper to apply for Tuple4's element 0
     * @param m1   mapper to apply for Tuple4's element 1
     * @param m2   mapper to apply for Tuple4's element 2
     * @param m3   mapper to apply for Tuple4's element 3
     * @return     a Function that, when applied, creates a {@link Tuple4} from
     *             an initial object of type T by applying the given mappers.
     * 
     * @see Tuple4
     * @see Tuple
     */
    public static <T, T0, T1, T2, T3> Function<T, Tuple4<T0, T1, T2, T3>> toTuple(
            Function<T, T0> m0,
            Function<T, T1> m1,
            Function<T, T2> m2,
            Function<T, T3> m3) {
        return new Tuple4MapperImpl<>(m0, m1, m2, m3);
    }
    
    /**
     * Creates and returns a {@link Tuple5} with the given parameters.
     * 
     * @param <T0> type of element 0
     * @param <T1> type of element 1
     * @param <T2> type of element 2
     * @param <T3> type of element 3
     * @param <T4> type of element 4
     * @param e0   element 0
     * @param e1   element 1
     * @param e2   element 2
     * @param e3   element 3
     * @param e4   element 4
     * @return     a {@link Tuple5} with the given parameters.
     * 
     * @see Tuple5
     * @see Tuple
     */
    public static <T0, T1, T2, T3, T4> Tuple5<T0, T1, T2, T3, T4> of(
            T0 e0,
            T1 e1,
            T2 e2,
            T3 e3,
            T4 e4) {
        return new Tuple5Impl<>(e0, e1, e2, e3, e4);
    }
    
    /**
     * Creates and returns a Function that, when applied, creates a {@link
     * Tuple5} from an initial object of type T by applying the given mappers.
     * 
     * @param <T>  type of the initial object to be used by the function to
     *             create a {@link Tuple5 }
     * @param <T0> target type of m0
     * @param <T1> target type of m1
     * @param <T2> target type of m2
     * @param <T3> target type of m3
     * @param <T4> target type of m4
     * @param m0   mapper to apply for Tuple5's element 0
     * @param m1   mapper to apply for Tuple5's element 1
     * @param m2   mapper to apply for Tuple5's element 2
     * @param m3   mapper to apply for Tuple5's element 3
     * @param m4   mapper to apply for Tuple5's element 4
     * @return     a Function that, when applied, creates a {@link Tuple5} from
     *             an initial object of type T by applying the given mappers.
     * 
     * @see Tuple5
     * @see Tuple
     */
    public static <T, T0, T1, T2, T3, T4> Function<T, Tuple5<T0, T1, T2, T3, T4>> toTuple(
            Function<T, T0> m0,
            Function<T, T1> m1,
            Function<T, T2> m2,
            Function<T, T3> m3,
            Function<T, T4> m4) {
        return new Tuple5MapperImpl<>(m0, m1, m2, m3, m4);
    }
    
    /**
     * Creates and returns a {@link Tuple6} with the given parameters.
     * 
     * @param <T0> type of element 0
     * @param <T1> type of element 1
     * @param <T2> type of element 2
     * @param <T3> type of element 3
     * @param <T4> type of element 4
     * @param <T5> type of element 5
     * @param e0   element 0
     * @param e1   element 1
     * @param e2   element 2
     * @param e3   element 3
     * @param e4   element 4
     * @param e5   element 5
     * @return     a {@link Tuple6} with the given parameters.
     * 
     * @see Tuple6
     * @see Tuple
     */
    public static <T0, T1, T2, T3, T4, T5> Tuple6<T0, T1, T2, T3, T4, T5> of(
            T0 e0,
            T1 e1,
            T2 e2,
            T3 e3,
            T4 e4,
            T5 e5) {
        return new Tuple6Impl<>(e0, e1, e2, e3, e4, e5);
    }
    
    /**
     * Creates and returns a Function that, when applied, creates a {@link
     * Tuple6} from an initial object of type T by applying the given mappers.
     * 
     * @param <T>  type of the initial object to be used by the function to
     *             create a {@link Tuple6 }
     * @param <T0> target type of m0
     * @param <T1> target type of m1
     * @param <T2> target type of m2
     * @param <T3> target type of m3
     * @param <T4> target type of m4
     * @param <T5> target type of m5
     * @param m0   mapper to apply for Tuple6's element 0
     * @param m1   mapper to apply for Tuple6's element 1
     * @param m2   mapper to apply for Tuple6's element 2
     * @param m3   mapper to apply for Tuple6's element 3
     * @param m4   mapper to apply for Tuple6's element 4
     * @param m5   mapper to apply for Tuple6's element 5
     * @return     a Function that, when applied, creates a {@link Tuple6} from
     *             an initial object of type T by applying the given mappers.
     * 
     * @see Tuple6
     * @see Tuple
     */
    public static <T, T0, T1, T2, T3, T4, T5> Function<T, Tuple6<T0, T1, T2, T3, T4, T5>> toTuple(
            Function<T, T0> m0,
            Function<T, T1> m1,
            Function<T, T2> m2,
            Function<T, T3> m3,
            Function<T, T4> m4,
            Function<T, T5> m5) {
        return new Tuple6MapperImpl<>(m0, m1, m2, m3, m4, m5);
    }
    
    /**
     * Creates and returns a {@link Tuple7} with the given parameters.
     * 
     * @param <T0> type of element 0
     * @param <T1> type of element 1
     * @param <T2> type of element 2
     * @param <T3> type of element 3
     * @param <T4> type of element 4
     * @param <T5> type of element 5
     * @param <T6> type of element 6
     * @param e0   element 0
     * @param e1   element 1
     * @param e2   element 2
     * @param e3   element 3
     * @param e4   element 4
     * @param e5   element 5
     * @param e6   element 6
     * @return     a {@link Tuple7} with the given parameters.
     * 
     * @see Tuple7
     * @see Tuple
     */
    public static <T0, T1, T2, T3, T4, T5, T6> Tuple7<T0, T1, T2, T3, T4, T5, T6> of(
            T0 e0,
            T1 e1,
            T2 e2,
            T3 e3,
            T4 e4,
            T5 e5,
            T6 e6) {
        return new Tuple7Impl<>(e0, e1, e2, e3, e4, e5, e6);
    }
    
    /**
     * Creates and returns a Function that, when applied, creates a {@link
     * Tuple7} from an initial object of type T by applying the given mappers.
     * 
     * @param <T>  type of the initial object to be used by the function to
     *             create a {@link Tuple7 }
     * @param <T0> target type of m0
     * @param <T1> target type of m1
     * @param <T2> target type of m2
     * @param <T3> target type of m3
     * @param <T4> target type of m4
     * @param <T5> target type of m5
     * @param <T6> target type of m6
     * @param m0   mapper to apply for Tuple7's element 0
     * @param m1   mapper to apply for Tuple7's element 1
     * @param m2   mapper to apply for Tuple7's element 2
     * @param m3   mapper to apply for Tuple7's element 3
     * @param m4   mapper to apply for Tuple7's element 4
     * @param m5   mapper to apply for Tuple7's element 5
     * @param m6   mapper to apply for Tuple7's element 6
     * @return     a Function that, when applied, creates a {@link Tuple7} from
     *             an initial object of type T by applying the given mappers.
     * 
     * @see Tuple7
     * @see Tuple
     */
    public static <T, T0, T1, T2, T3, T4, T5, T6> Function<T, Tuple7<T0, T1, T2, T3, T4, T5, T6>> toTuple(
            Function<T, T0> m0,
            Function<T, T1> m1,
            Function<T, T2> m2,
            Function<T, T3> m3,
            Function<T, T4> m4,
            Function<T, T5> m5,
            Function<T, T6> m6) {
        return new Tuple7MapperImpl<>(m0, m1, m2, m3, m4, m5, m6);
    }
    
    /**
     * Creates and returns a {@link Tuple8} with the given parameters.
     * 
     * @param <T0> type of element 0
     * @param <T1> type of element 1
     * @param <T2> type of element 2
     * @param <T3> type of element 3
     * @param <T4> type of element 4
     * @param <T5> type of element 5
     * @param <T6> type of element 6
     * @param <T7> type of element 7
     * @param e0   element 0
     * @param e1   element 1
     * @param e2   element 2
     * @param e3   element 3
     * @param e4   element 4
     * @param e5   element 5
     * @param e6   element 6
     * @param e7   element 7
     * @return     a {@link Tuple8} with the given parameters.
     * 
     * @see Tuple8
     * @see Tuple
     */
    public static <T0, T1, T2, T3, T4, T5, T6, T7> Tuple8<T0, T1, T2, T3, T4, T5, T6, T7> of(
            T0 e0,
            T1 e1,
            T2 e2,
            T3 e3,
            T4 e4,
            T5 e5,
            T6 e6,
            T7 e7) {
        return new Tuple8Impl<>(e0, e1, e2, e3, e4, e5, e6, e7);
    }
    
    /**
     * Creates and returns a Function that, when applied, creates a {@link
     * Tuple8} from an initial object of type T by applying the given mappers.
     * 
     * @param <T>  type of the initial object to be used by the function to
     *             create a {@link Tuple8 }
     * @param <T0> target type of m0
     * @param <T1> target type of m1
     * @param <T2> target type of m2
     * @param <T3> target type of m3
     * @param <T4> target type of m4
     * @param <T5> target type of m5
     * @param <T6> target type of m6
     * @param <T7> target type of m7
     * @param m0   mapper to apply for Tuple8's element 0
     * @param m1   mapper to apply for Tuple8's element 1
     * @param m2   mapper to apply for Tuple8's element 2
     * @param m3   mapper to apply for Tuple8's element 3
     * @param m4   mapper to apply for Tuple8's element 4
     * @param m5   mapper to apply for Tuple8's element 5
     * @param m6   mapper to apply for Tuple8's element 6
     * @param m7   mapper to apply for Tuple8's element 7
     * @return     a Function that, when applied, creates a {@link Tuple8} from
     *             an initial object of type T by applying the given mappers.
     * 
     * @see Tuple8
     * @see Tuple
     */
    public static <T, T0, T1, T2, T3, T4, T5, T6, T7> Function<T, Tuple8<T0, T1, T2, T3, T4, T5, T6, T7>> toTuple(
            Function<T, T0> m0,
            Function<T, T1> m1,
            Function<T, T2> m2,
            Function<T, T3> m3,
            Function<T, T4> m4,
            Function<T, T5> m5,
            Function<T, T6> m6,
            Function<T, T7> m7) {
        return new Tuple8MapperImpl<>(m0, m1, m2, m3, m4, m5, m6, m7);
    }
    
    /**
     * Creates and returns a {@link Tuple9} with the given parameters.
     * 
     * @param <T0> type of element 0
     * @param <T1> type of element 1
     * @param <T2> type of element 2
     * @param <T3> type of element 3
     * @param <T4> type of element 4
     * @param <T5> type of element 5
     * @param <T6> type of element 6
     * @param <T7> type of element 7
     * @param <T8> type of element 8
     * @param e0   element 0
     * @param e1   element 1
     * @param e2   element 2
     * @param e3   element 3
     * @param e4   element 4
     * @param e5   element 5
     * @param e6   element 6
     * @param e7   element 7
     * @param e8   element 8
     * @return     a {@link Tuple9} with the given parameters.
     * 
     * @see Tuple9
     * @see Tuple
     */
    public static <T0, T1, T2, T3, T4, T5, T6, T7, T8> Tuple9<T0, T1, T2, T3, T4, T5, T6, T7, T8> of(
            T0 e0,
            T1 e1,
            T2 e2,
            T3 e3,
            T4 e4,
            T5 e5,
            T6 e6,
            T7 e7,
            T8 e8) {
        return new Tuple9Impl<>(e0, e1, e2, e3, e4, e5, e6, e7, e8);
    }
    
    /**
     * Creates and returns a Function that, when applied, creates a {@link
     * Tuple9} from an initial object of type T by applying the given mappers.
     * 
     * @param <T>  type of the initial object to be used by the function to
     *             create a {@link Tuple9 }
     * @param <T0> target type of m0
     * @param <T1> target type of m1
     * @param <T2> target type of m2
     * @param <T3> target type of m3
     * @param <T4> target type of m4
     * @param <T5> target type of m5
     * @param <T6> target type of m6
     * @param <T7> target type of m7
     * @param <T8> target type of m8
     * @param m0   mapper to apply for Tuple9's element 0
     * @param m1   mapper to apply for Tuple9's element 1
     * @param m2   mapper to apply for Tuple9's element 2
     * @param m3   mapper to apply for Tuple9's element 3
     * @param m4   mapper to apply for Tuple9's element 4
     * @param m5   mapper to apply for Tuple9's element 5
     * @param m6   mapper to apply for Tuple9's element 6
     * @param m7   mapper to apply for Tuple9's element 7
     * @param m8   mapper to apply for Tuple9's element 8
     * @return     a Function that, when applied, creates a {@link Tuple9} from
     *             an initial object of type T by applying the given mappers.
     * 
     * @see Tuple9
     * @see Tuple
     */
    public static <T, T0, T1, T2, T3, T4, T5, T6, T7, T8> Function<T, Tuple9<T0, T1, T2, T3, T4, T5, T6, T7, T8>> toTuple(
            Function<T, T0> m0,
            Function<T, T1> m1,
            Function<T, T2> m2,
            Function<T, T3> m3,
            Function<T, T4> m4,
            Function<T, T5> m5,
            Function<T, T6> m6,
            Function<T, T7> m7,
            Function<T, T8> m8) {
        return new Tuple9MapperImpl<>(m0, m1, m2, m3, m4, m5, m6, m7, m8);
    }
    
    /**
     * Creates and returns a {@link Tuple10} with the given parameters.
     * 
     * @param <T0> type of element 0
     * @param <T1> type of element 1
     * @param <T2> type of element 2
     * @param <T3> type of element 3
     * @param <T4> type of element 4
     * @param <T5> type of element 5
     * @param <T6> type of element 6
     * @param <T7> type of element 7
     * @param <T8> type of element 8
     * @param <T9> type of element 9
     * @param e0   element 0
     * @param e1   element 1
     * @param e2   element 2
     * @param e3   element 3
     * @param e4   element 4
     * @param e5   element 5
     * @param e6   element 6
     * @param e7   element 7
     * @param e8   element 8
     * @param e9   element 9
     * @return     a {@link Tuple10} with the given parameters.
     * 
     * @see Tuple10
     * @see Tuple
     */
    public static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9> Tuple10<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9> of(
            T0 e0,
            T1 e1,
            T2 e2,
            T3 e3,
            T4 e4,
            T5 e5,
            T6 e6,
            T7 e7,
            T8 e8,
            T9 e9) {
        return new Tuple10Impl<>(e0, e1, e2, e3, e4, e5, e6, e7, e8, e9);
    }
    
    /**
     * Creates and returns a Function that, when applied, creates a {@link
     * Tuple10} from an initial object of type T by applying the given mappers.
     * 
     * @param <T>  type of the initial object to be used by the function to
     *             create a {@link Tuple10 }
     * @param <T0> target type of m0
     * @param <T1> target type of m1
     * @param <T2> target type of m2
     * @param <T3> target type of m3
     * @param <T4> target type of m4
     * @param <T5> target type of m5
     * @param <T6> target type of m6
     * @param <T7> target type of m7
     * @param <T8> target type of m8
     * @param <T9> target type of m9
     * @param m0   mapper to apply for Tuple10's element 0
     * @param m1   mapper to apply for Tuple10's element 1
     * @param m2   mapper to apply for Tuple10's element 2
     * @param m3   mapper to apply for Tuple10's element 3
     * @param m4   mapper to apply for Tuple10's element 4
     * @param m5   mapper to apply for Tuple10's element 5
     * @param m6   mapper to apply for Tuple10's element 6
     * @param m7   mapper to apply for Tuple10's element 7
     * @param m8   mapper to apply for Tuple10's element 8
     * @param m9   mapper to apply for Tuple10's element 9
     * @return     a Function that, when applied, creates a {@link Tuple10} from
     *             an initial object of type T by applying the given mappers.
     * 
     * @see Tuple10
     * @see Tuple
     */
    public static <T, T0, T1, T2, T3, T4, T5, T6, T7, T8, T9> Function<T, Tuple10<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9>> toTuple(
            Function<T, T0> m0,
            Function<T, T1> m1,
            Function<T, T2> m2,
            Function<T, T3> m3,
            Function<T, T4> m4,
            Function<T, T5> m5,
            Function<T, T6> m6,
            Function<T, T7> m7,
            Function<T, T8> m8,
            Function<T, T9> m9) {
        return new Tuple10MapperImpl<>(m0, m1, m2, m3, m4, m5, m6, m7, m8, m9);
    }
    
    /**
     * Creates and returns a {@link Tuple11} with the given parameters.
     * 
     * @param <T0>  type of element 0
     * @param <T1>  type of element 1
     * @param <T2>  type of element 2
     * @param <T3>  type of element 3
     * @param <T4>  type of element 4
     * @param <T5>  type of element 5
     * @param <T6>  type of element 6
     * @param <T7>  type of element 7
     * @param <T8>  type of element 8
     * @param <T9>  type of element 9
     * @param <T10> type of element 10
     * @param e0    element 0
     * @param e1    element 1
     * @param e2    element 2
     * @param e3    element 3
     * @param e4    element 4
     * @param e5    element 5
     * @param e6    element 6
     * @param e7    element 7
     * @param e8    element 8
     * @param e9    element 9
     * @param e10   element 10
     * @return      a {@link Tuple11} with the given parameters.
     * 
     * @see Tuple11
     * @see Tuple
     */
    public static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> Tuple11<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> of(
            T0 e0,
            T1 e1,
            T2 e2,
            T3 e3,
            T4 e4,
            T5 e5,
            T6 e6,
            T7 e7,
            T8 e8,
            T9 e9,
            T10 e10) {
        return new Tuple11Impl<>(e0, e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);
    }
    
    /**
     * Creates and returns a Function that, when applied, creates a {@link
     * Tuple11} from an initial object of type T by applying the given mappers.
     * 
     * @param <T>   type of the initial object to be used by the function to
     *              create a {@link Tuple11 }
     * @param <T0>  target type of m0
     * @param <T1>  target type of m1
     * @param <T2>  target type of m2
     * @param <T3>  target type of m3
     * @param <T4>  target type of m4
     * @param <T5>  target type of m5
     * @param <T6>  target type of m6
     * @param <T7>  target type of m7
     * @param <T8>  target type of m8
     * @param <T9>  target type of m9
     * @param <T10> target type of m10
     * @param m0    mapper to apply for Tuple11's element 0
     * @param m1    mapper to apply for Tuple11's element 1
     * @param m2    mapper to apply for Tuple11's element 2
     * @param m3    mapper to apply for Tuple11's element 3
     * @param m4    mapper to apply for Tuple11's element 4
     * @param m5    mapper to apply for Tuple11's element 5
     * @param m6    mapper to apply for Tuple11's element 6
     * @param m7    mapper to apply for Tuple11's element 7
     * @param m8    mapper to apply for Tuple11's element 8
     * @param m9    mapper to apply for Tuple11's element 9
     * @param m10   mapper to apply for Tuple11's element 10
     * @return      a Function that, when applied, creates a {@link Tuple11}
     *              from an initial object of type T by applying the given
     *              mappers.
     * 
     * @see Tuple11
     * @see Tuple
     */
    public static <T, T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> Function<T, Tuple11<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>> toTuple(
            Function<T, T0> m0,
            Function<T, T1> m1,
            Function<T, T2> m2,
            Function<T, T3> m3,
            Function<T, T4> m4,
            Function<T, T5> m5,
            Function<T, T6> m6,
            Function<T, T7> m7,
            Function<T, T8> m8,
            Function<T, T9> m9,
            Function<T, T10> m10) {
        return new Tuple11MapperImpl<>(m0, m1, m2, m3, m4, m5, m6, m7, m8, m9, m10);
    }
    
    /**
     * Creates and returns a {@link Tuple12} with the given parameters.
     * 
     * @param <T0>  type of element 0
     * @param <T1>  type of element 1
     * @param <T2>  type of element 2
     * @param <T3>  type of element 3
     * @param <T4>  type of element 4
     * @param <T5>  type of element 5
     * @param <T6>  type of element 6
     * @param <T7>  type of element 7
     * @param <T8>  type of element 8
     * @param <T9>  type of element 9
     * @param <T10> type of element 10
     * @param <T11> type of element 11
     * @param e0    element 0
     * @param e1    element 1
     * @param e2    element 2
     * @param e3    element 3
     * @param e4    element 4
     * @param e5    element 5
     * @param e6    element 6
     * @param e7    element 7
     * @param e8    element 8
     * @param e9    element 9
     * @param e10   element 10
     * @param e11   element 11
     * @return      a {@link Tuple12} with the given parameters.
     * 
     * @see Tuple12
     * @see Tuple
     */
    public static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> Tuple12<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> of(
            T0 e0,
            T1 e1,
            T2 e2,
            T3 e3,
            T4 e4,
            T5 e5,
            T6 e6,
            T7 e7,
            T8 e8,
            T9 e9,
            T10 e10,
            T11 e11) {
        return new Tuple12Impl<>(e0, e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11);
    }
    
    /**
     * Creates and returns a Function that, when applied, creates a {@link
     * Tuple12} from an initial object of type T by applying the given mappers.
     * 
     * @param <T>   type of the initial object to be used by the function to
     *              create a {@link Tuple12 }
     * @param <T0>  target type of m0
     * @param <T1>  target type of m1
     * @param <T2>  target type of m2
     * @param <T3>  target type of m3
     * @param <T4>  target type of m4
     * @param <T5>  target type of m5
     * @param <T6>  target type of m6
     * @param <T7>  target type of m7
     * @param <T8>  target type of m8
     * @param <T9>  target type of m9
     * @param <T10> target type of m10
     * @param <T11> target type of m11
     * @param m0    mapper to apply for Tuple12's element 0
     * @param m1    mapper to apply for Tuple12's element 1
     * @param m2    mapper to apply for Tuple12's element 2
     * @param m3    mapper to apply for Tuple12's element 3
     * @param m4    mapper to apply for Tuple12's element 4
     * @param m5    mapper to apply for Tuple12's element 5
     * @param m6    mapper to apply for Tuple12's element 6
     * @param m7    mapper to apply for Tuple12's element 7
     * @param m8    mapper to apply for Tuple12's element 8
     * @param m9    mapper to apply for Tuple12's element 9
     * @param m10   mapper to apply for Tuple12's element 10
     * @param m11   mapper to apply for Tuple12's element 11
     * @return      a Function that, when applied, creates a {@link Tuple12}
     *              from an initial object of type T by applying the given
     *              mappers.
     * 
     * @see Tuple12
     * @see Tuple
     */
    public static <T, T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> Function<T, Tuple12<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>> toTuple(
            Function<T, T0> m0,
            Function<T, T1> m1,
            Function<T, T2> m2,
            Function<T, T3> m3,
            Function<T, T4> m4,
            Function<T, T5> m5,
            Function<T, T6> m6,
            Function<T, T7> m7,
            Function<T, T8> m8,
            Function<T, T9> m9,
            Function<T, T10> m10,
            Function<T, T11> m11) {
        return new Tuple12MapperImpl<>(m0, m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11);
    }
    
    /**
     * Creates and returns a {@link Tuple13} with the given parameters.
     * 
     * @param <T0>  type of element 0
     * @param <T1>  type of element 1
     * @param <T2>  type of element 2
     * @param <T3>  type of element 3
     * @param <T4>  type of element 4
     * @param <T5>  type of element 5
     * @param <T6>  type of element 6
     * @param <T7>  type of element 7
     * @param <T8>  type of element 8
     * @param <T9>  type of element 9
     * @param <T10> type of element 10
     * @param <T11> type of element 11
     * @param <T12> type of element 12
     * @param e0    element 0
     * @param e1    element 1
     * @param e2    element 2
     * @param e3    element 3
     * @param e4    element 4
     * @param e5    element 5
     * @param e6    element 6
     * @param e7    element 7
     * @param e8    element 8
     * @param e9    element 9
     * @param e10   element 10
     * @param e11   element 11
     * @param e12   element 12
     * @return      a {@link Tuple13} with the given parameters.
     * 
     * @see Tuple13
     * @see Tuple
     */
    public static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> Tuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> of(
            T0 e0,
            T1 e1,
            T2 e2,
            T3 e3,
            T4 e4,
            T5 e5,
            T6 e6,
            T7 e7,
            T8 e8,
            T9 e9,
            T10 e10,
            T11 e11,
            T12 e12) {
        return new Tuple13Impl<>(e0, e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12);
    }
    
    /**
     * Creates and returns a Function that, when applied, creates a {@link
     * Tuple13} from an initial object of type T by applying the given mappers.
     * 
     * @param <T>   type of the initial object to be used by the function to
     *              create a {@link Tuple13 }
     * @param <T0>  target type of m0
     * @param <T1>  target type of m1
     * @param <T2>  target type of m2
     * @param <T3>  target type of m3
     * @param <T4>  target type of m4
     * @param <T5>  target type of m5
     * @param <T6>  target type of m6
     * @param <T7>  target type of m7
     * @param <T8>  target type of m8
     * @param <T9>  target type of m9
     * @param <T10> target type of m10
     * @param <T11> target type of m11
     * @param <T12> target type of m12
     * @param m0    mapper to apply for Tuple13's element 0
     * @param m1    mapper to apply for Tuple13's element 1
     * @param m2    mapper to apply for Tuple13's element 2
     * @param m3    mapper to apply for Tuple13's element 3
     * @param m4    mapper to apply for Tuple13's element 4
     * @param m5    mapper to apply for Tuple13's element 5
     * @param m6    mapper to apply for Tuple13's element 6
     * @param m7    mapper to apply for Tuple13's element 7
     * @param m8    mapper to apply for Tuple13's element 8
     * @param m9    mapper to apply for Tuple13's element 9
     * @param m10   mapper to apply for Tuple13's element 10
     * @param m11   mapper to apply for Tuple13's element 11
     * @param m12   mapper to apply for Tuple13's element 12
     * @return      a Function that, when applied, creates a {@link Tuple13}
     *              from an initial object of type T by applying the given
     *              mappers.
     * 
     * @see Tuple13
     * @see Tuple
     */
    public static <T, T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> Function<T, Tuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>> toTuple(
            Function<T, T0> m0,
            Function<T, T1> m1,
            Function<T, T2> m2,
            Function<T, T3> m3,
            Function<T, T4> m4,
            Function<T, T5> m5,
            Function<T, T6> m6,
            Function<T, T7> m7,
            Function<T, T8> m8,
            Function<T, T9> m9,
            Function<T, T10> m10,
            Function<T, T11> m11,
            Function<T, T12> m12) {
        return new Tuple13MapperImpl<>(m0, m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12);
    }
    
    /**
     * Creates and returns a {@link Tuple14} with the given parameters.
     * 
     * @param <T0>  type of element 0
     * @param <T1>  type of element 1
     * @param <T2>  type of element 2
     * @param <T3>  type of element 3
     * @param <T4>  type of element 4
     * @param <T5>  type of element 5
     * @param <T6>  type of element 6
     * @param <T7>  type of element 7
     * @param <T8>  type of element 8
     * @param <T9>  type of element 9
     * @param <T10> type of element 10
     * @param <T11> type of element 11
     * @param <T12> type of element 12
     * @param <T13> type of element 13
     * @param e0    element 0
     * @param e1    element 1
     * @param e2    element 2
     * @param e3    element 3
     * @param e4    element 4
     * @param e5    element 5
     * @param e6    element 6
     * @param e7    element 7
     * @param e8    element 8
     * @param e9    element 9
     * @param e10   element 10
     * @param e11   element 11
     * @param e12   element 12
     * @param e13   element 13
     * @return      a {@link Tuple14} with the given parameters.
     * 
     * @see Tuple14
     * @see Tuple
     */
    public static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> Tuple14<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> of(
            T0 e0,
            T1 e1,
            T2 e2,
            T3 e3,
            T4 e4,
            T5 e5,
            T6 e6,
            T7 e7,
            T8 e8,
            T9 e9,
            T10 e10,
            T11 e11,
            T12 e12,
            T13 e13) {
        return new Tuple14Impl<>(e0, e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13);
    }
    
    /**
     * Creates and returns a Function that, when applied, creates a {@link
     * Tuple14} from an initial object of type T by applying the given mappers.
     * 
     * @param <T>   type of the initial object to be used by the function to
     *              create a {@link Tuple14 }
     * @param <T0>  target type of m0
     * @param <T1>  target type of m1
     * @param <T2>  target type of m2
     * @param <T3>  target type of m3
     * @param <T4>  target type of m4
     * @param <T5>  target type of m5
     * @param <T6>  target type of m6
     * @param <T7>  target type of m7
     * @param <T8>  target type of m8
     * @param <T9>  target type of m9
     * @param <T10> target type of m10
     * @param <T11> target type of m11
     * @param <T12> target type of m12
     * @param <T13> target type of m13
     * @param m0    mapper to apply for Tuple14's element 0
     * @param m1    mapper to apply for Tuple14's element 1
     * @param m2    mapper to apply for Tuple14's element 2
     * @param m3    mapper to apply for Tuple14's element 3
     * @param m4    mapper to apply for Tuple14's element 4
     * @param m5    mapper to apply for Tuple14's element 5
     * @param m6    mapper to apply for Tuple14's element 6
     * @param m7    mapper to apply for Tuple14's element 7
     * @param m8    mapper to apply for Tuple14's element 8
     * @param m9    mapper to apply for Tuple14's element 9
     * @param m10   mapper to apply for Tuple14's element 10
     * @param m11   mapper to apply for Tuple14's element 11
     * @param m12   mapper to apply for Tuple14's element 12
     * @param m13   mapper to apply for Tuple14's element 13
     * @return      a Function that, when applied, creates a {@link Tuple14}
     *              from an initial object of type T by applying the given
     *              mappers.
     * 
     * @see Tuple14
     * @see Tuple
     */
    public static <T, T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> Function<T, Tuple14<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>> toTuple(
            Function<T, T0> m0,
            Function<T, T1> m1,
            Function<T, T2> m2,
            Function<T, T3> m3,
            Function<T, T4> m4,
            Function<T, T5> m5,
            Function<T, T6> m6,
            Function<T, T7> m7,
            Function<T, T8> m8,
            Function<T, T9> m9,
            Function<T, T10> m10,
            Function<T, T11> m11,
            Function<T, T12> m12,
            Function<T, T13> m13) {
        return new Tuple14MapperImpl<>(m0, m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12, m13);
    }
    
    /**
     * Creates and returns a {@link Tuple15} with the given parameters.
     * 
     * @param <T0>  type of element 0
     * @param <T1>  type of element 1
     * @param <T2>  type of element 2
     * @param <T3>  type of element 3
     * @param <T4>  type of element 4
     * @param <T5>  type of element 5
     * @param <T6>  type of element 6
     * @param <T7>  type of element 7
     * @param <T8>  type of element 8
     * @param <T9>  type of element 9
     * @param <T10> type of element 10
     * @param <T11> type of element 11
     * @param <T12> type of element 12
     * @param <T13> type of element 13
     * @param <T14> type of element 14
     * @param e0    element 0
     * @param e1    element 1
     * @param e2    element 2
     * @param e3    element 3
     * @param e4    element 4
     * @param e5    element 5
     * @param e6    element 6
     * @param e7    element 7
     * @param e8    element 8
     * @param e9    element 9
     * @param e10   element 10
     * @param e11   element 11
     * @param e12   element 12
     * @param e13   element 13
     * @param e14   element 14
     * @return      a {@link Tuple15} with the given parameters.
     * 
     * @see Tuple15
     * @see Tuple
     */
    public static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> Tuple15<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> of(
            T0 e0,
            T1 e1,
            T2 e2,
            T3 e3,
            T4 e4,
            T5 e5,
            T6 e6,
            T7 e7,
            T8 e8,
            T9 e9,
            T10 e10,
            T11 e11,
            T12 e12,
            T13 e13,
            T14 e14) {
        return new Tuple15Impl<>(e0, e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14);
    }
    
    /**
     * Creates and returns a Function that, when applied, creates a {@link
     * Tuple15} from an initial object of type T by applying the given mappers.
     * 
     * @param <T>   type of the initial object to be used by the function to
     *              create a {@link Tuple15 }
     * @param <T0>  target type of m0
     * @param <T1>  target type of m1
     * @param <T2>  target type of m2
     * @param <T3>  target type of m3
     * @param <T4>  target type of m4
     * @param <T5>  target type of m5
     * @param <T6>  target type of m6
     * @param <T7>  target type of m7
     * @param <T8>  target type of m8
     * @param <T9>  target type of m9
     * @param <T10> target type of m10
     * @param <T11> target type of m11
     * @param <T12> target type of m12
     * @param <T13> target type of m13
     * @param <T14> target type of m14
     * @param m0    mapper to apply for Tuple15's element 0
     * @param m1    mapper to apply for Tuple15's element 1
     * @param m2    mapper to apply for Tuple15's element 2
     * @param m3    mapper to apply for Tuple15's element 3
     * @param m4    mapper to apply for Tuple15's element 4
     * @param m5    mapper to apply for Tuple15's element 5
     * @param m6    mapper to apply for Tuple15's element 6
     * @param m7    mapper to apply for Tuple15's element 7
     * @param m8    mapper to apply for Tuple15's element 8
     * @param m9    mapper to apply for Tuple15's element 9
     * @param m10   mapper to apply for Tuple15's element 10
     * @param m11   mapper to apply for Tuple15's element 11
     * @param m12   mapper to apply for Tuple15's element 12
     * @param m13   mapper to apply for Tuple15's element 13
     * @param m14   mapper to apply for Tuple15's element 14
     * @return      a Function that, when applied, creates a {@link Tuple15}
     *              from an initial object of type T by applying the given
     *              mappers.
     * 
     * @see Tuple15
     * @see Tuple
     */
    public static <T, T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> Function<T, Tuple15<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>> toTuple(
            Function<T, T0> m0,
            Function<T, T1> m1,
            Function<T, T2> m2,
            Function<T, T3> m3,
            Function<T, T4> m4,
            Function<T, T5> m5,
            Function<T, T6> m6,
            Function<T, T7> m7,
            Function<T, T8> m8,
            Function<T, T9> m9,
            Function<T, T10> m10,
            Function<T, T11> m11,
            Function<T, T12> m12,
            Function<T, T13> m13,
            Function<T, T14> m14) {
        return new Tuple15MapperImpl<>(m0, m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12, m13, m14);
    }
    
    /**
     * Creates and returns a {@link Tuple16} with the given parameters.
     * 
     * @param <T0>  type of element 0
     * @param <T1>  type of element 1
     * @param <T2>  type of element 2
     * @param <T3>  type of element 3
     * @param <T4>  type of element 4
     * @param <T5>  type of element 5
     * @param <T6>  type of element 6
     * @param <T7>  type of element 7
     * @param <T8>  type of element 8
     * @param <T9>  type of element 9
     * @param <T10> type of element 10
     * @param <T11> type of element 11
     * @param <T12> type of element 12
     * @param <T13> type of element 13
     * @param <T14> type of element 14
     * @param <T15> type of element 15
     * @param e0    element 0
     * @param e1    element 1
     * @param e2    element 2
     * @param e3    element 3
     * @param e4    element 4
     * @param e5    element 5
     * @param e6    element 6
     * @param e7    element 7
     * @param e8    element 8
     * @param e9    element 9
     * @param e10   element 10
     * @param e11   element 11
     * @param e12   element 12
     * @param e13   element 13
     * @param e14   element 14
     * @param e15   element 15
     * @return      a {@link Tuple16} with the given parameters.
     * 
     * @see Tuple16
     * @see Tuple
     */
    public static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> Tuple16<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> of(
            T0 e0,
            T1 e1,
            T2 e2,
            T3 e3,
            T4 e4,
            T5 e5,
            T6 e6,
            T7 e7,
            T8 e8,
            T9 e9,
            T10 e10,
            T11 e11,
            T12 e12,
            T13 e13,
            T14 e14,
            T15 e15) {
        return new Tuple16Impl<>(e0, e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15);
    }
    
    /**
     * Creates and returns a Function that, when applied, creates a {@link
     * Tuple16} from an initial object of type T by applying the given mappers.
     * 
     * @param <T>   type of the initial object to be used by the function to
     *              create a {@link Tuple16 }
     * @param <T0>  target type of m0
     * @param <T1>  target type of m1
     * @param <T2>  target type of m2
     * @param <T3>  target type of m3
     * @param <T4>  target type of m4
     * @param <T5>  target type of m5
     * @param <T6>  target type of m6
     * @param <T7>  target type of m7
     * @param <T8>  target type of m8
     * @param <T9>  target type of m9
     * @param <T10> target type of m10
     * @param <T11> target type of m11
     * @param <T12> target type of m12
     * @param <T13> target type of m13
     * @param <T14> target type of m14
     * @param <T15> target type of m15
     * @param m0    mapper to apply for Tuple16's element 0
     * @param m1    mapper to apply for Tuple16's element 1
     * @param m2    mapper to apply for Tuple16's element 2
     * @param m3    mapper to apply for Tuple16's element 3
     * @param m4    mapper to apply for Tuple16's element 4
     * @param m5    mapper to apply for Tuple16's element 5
     * @param m6    mapper to apply for Tuple16's element 6
     * @param m7    mapper to apply for Tuple16's element 7
     * @param m8    mapper to apply for Tuple16's element 8
     * @param m9    mapper to apply for Tuple16's element 9
     * @param m10   mapper to apply for Tuple16's element 10
     * @param m11   mapper to apply for Tuple16's element 11
     * @param m12   mapper to apply for Tuple16's element 12
     * @param m13   mapper to apply for Tuple16's element 13
     * @param m14   mapper to apply for Tuple16's element 14
     * @param m15   mapper to apply for Tuple16's element 15
     * @return      a Function that, when applied, creates a {@link Tuple16}
     *              from an initial object of type T by applying the given
     *              mappers.
     * 
     * @see Tuple16
     * @see Tuple
     */
    public static <T, T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> Function<T, Tuple16<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>> toTuple(
            Function<T, T0> m0,
            Function<T, T1> m1,
            Function<T, T2> m2,
            Function<T, T3> m3,
            Function<T, T4> m4,
            Function<T, T5> m5,
            Function<T, T6> m6,
            Function<T, T7> m7,
            Function<T, T8> m8,
            Function<T, T9> m9,
            Function<T, T10> m10,
            Function<T, T11> m11,
            Function<T, T12> m12,
            Function<T, T13> m13,
            Function<T, T14> m14,
            Function<T, T15> m15) {
        return new Tuple16MapperImpl<>(m0, m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12, m13, m14, m15);
    }
    
    /**
     * Creates and returns a {@link Tuple17} with the given parameters.
     * 
     * @param <T0>  type of element 0
     * @param <T1>  type of element 1
     * @param <T2>  type of element 2
     * @param <T3>  type of element 3
     * @param <T4>  type of element 4
     * @param <T5>  type of element 5
     * @param <T6>  type of element 6
     * @param <T7>  type of element 7
     * @param <T8>  type of element 8
     * @param <T9>  type of element 9
     * @param <T10> type of element 10
     * @param <T11> type of element 11
     * @param <T12> type of element 12
     * @param <T13> type of element 13
     * @param <T14> type of element 14
     * @param <T15> type of element 15
     * @param <T16> type of element 16
     * @param e0    element 0
     * @param e1    element 1
     * @param e2    element 2
     * @param e3    element 3
     * @param e4    element 4
     * @param e5    element 5
     * @param e6    element 6
     * @param e7    element 7
     * @param e8    element 8
     * @param e9    element 9
     * @param e10   element 10
     * @param e11   element 11
     * @param e12   element 12
     * @param e13   element 13
     * @param e14   element 14
     * @param e15   element 15
     * @param e16   element 16
     * @return      a {@link Tuple17} with the given parameters.
     * 
     * @see Tuple17
     * @see Tuple
     */
    public static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> Tuple17<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> of(
            T0 e0,
            T1 e1,
            T2 e2,
            T3 e3,
            T4 e4,
            T5 e5,
            T6 e6,
            T7 e7,
            T8 e8,
            T9 e9,
            T10 e10,
            T11 e11,
            T12 e12,
            T13 e13,
            T14 e14,
            T15 e15,
            T16 e16) {
        return new Tuple17Impl<>(e0, e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16);
    }
    
    /**
     * Creates and returns a Function that, when applied, creates a {@link
     * Tuple17} from an initial object of type T by applying the given mappers.
     * 
     * @param <T>   type of the initial object to be used by the function to
     *              create a {@link Tuple17 }
     * @param <T0>  target type of m0
     * @param <T1>  target type of m1
     * @param <T2>  target type of m2
     * @param <T3>  target type of m3
     * @param <T4>  target type of m4
     * @param <T5>  target type of m5
     * @param <T6>  target type of m6
     * @param <T7>  target type of m7
     * @param <T8>  target type of m8
     * @param <T9>  target type of m9
     * @param <T10> target type of m10
     * @param <T11> target type of m11
     * @param <T12> target type of m12
     * @param <T13> target type of m13
     * @param <T14> target type of m14
     * @param <T15> target type of m15
     * @param <T16> target type of m16
     * @param m0    mapper to apply for Tuple17's element 0
     * @param m1    mapper to apply for Tuple17's element 1
     * @param m2    mapper to apply for Tuple17's element 2
     * @param m3    mapper to apply for Tuple17's element 3
     * @param m4    mapper to apply for Tuple17's element 4
     * @param m5    mapper to apply for Tuple17's element 5
     * @param m6    mapper to apply for Tuple17's element 6
     * @param m7    mapper to apply for Tuple17's element 7
     * @param m8    mapper to apply for Tuple17's element 8
     * @param m9    mapper to apply for Tuple17's element 9
     * @param m10   mapper to apply for Tuple17's element 10
     * @param m11   mapper to apply for Tuple17's element 11
     * @param m12   mapper to apply for Tuple17's element 12
     * @param m13   mapper to apply for Tuple17's element 13
     * @param m14   mapper to apply for Tuple17's element 14
     * @param m15   mapper to apply for Tuple17's element 15
     * @param m16   mapper to apply for Tuple17's element 16
     * @return      a Function that, when applied, creates a {@link Tuple17}
     *              from an initial object of type T by applying the given
     *              mappers.
     * 
     * @see Tuple17
     * @see Tuple
     */
    public static <T, T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> Function<T, Tuple17<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>> toTuple(
            Function<T, T0> m0,
            Function<T, T1> m1,
            Function<T, T2> m2,
            Function<T, T3> m3,
            Function<T, T4> m4,
            Function<T, T5> m5,
            Function<T, T6> m6,
            Function<T, T7> m7,
            Function<T, T8> m8,
            Function<T, T9> m9,
            Function<T, T10> m10,
            Function<T, T11> m11,
            Function<T, T12> m12,
            Function<T, T13> m13,
            Function<T, T14> m14,
            Function<T, T15> m15,
            Function<T, T16> m16) {
        return new Tuple17MapperImpl<>(m0, m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12, m13, m14, m15, m16);
    }
    
    /**
     * Creates and returns a {@link Tuple18} with the given parameters.
     * 
     * @param <T0>  type of element 0
     * @param <T1>  type of element 1
     * @param <T2>  type of element 2
     * @param <T3>  type of element 3
     * @param <T4>  type of element 4
     * @param <T5>  type of element 5
     * @param <T6>  type of element 6
     * @param <T7>  type of element 7
     * @param <T8>  type of element 8
     * @param <T9>  type of element 9
     * @param <T10> type of element 10
     * @param <T11> type of element 11
     * @param <T12> type of element 12
     * @param <T13> type of element 13
     * @param <T14> type of element 14
     * @param <T15> type of element 15
     * @param <T16> type of element 16
     * @param <T17> type of element 17
     * @param e0    element 0
     * @param e1    element 1
     * @param e2    element 2
     * @param e3    element 3
     * @param e4    element 4
     * @param e5    element 5
     * @param e6    element 6
     * @param e7    element 7
     * @param e8    element 8
     * @param e9    element 9
     * @param e10   element 10
     * @param e11   element 11
     * @param e12   element 12
     * @param e13   element 13
     * @param e14   element 14
     * @param e15   element 15
     * @param e16   element 16
     * @param e17   element 17
     * @return      a {@link Tuple18} with the given parameters.
     * 
     * @see Tuple18
     * @see Tuple
     */
    public static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> Tuple18<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> of(
            T0 e0,
            T1 e1,
            T2 e2,
            T3 e3,
            T4 e4,
            T5 e5,
            T6 e6,
            T7 e7,
            T8 e8,
            T9 e9,
            T10 e10,
            T11 e11,
            T12 e12,
            T13 e13,
            T14 e14,
            T15 e15,
            T16 e16,
            T17 e17) {
        return new Tuple18Impl<>(e0, e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17);
    }
    
    /**
     * Creates and returns a Function that, when applied, creates a {@link
     * Tuple18} from an initial object of type T by applying the given mappers.
     * 
     * @param <T>   type of the initial object to be used by the function to
     *              create a {@link Tuple18 }
     * @param <T0>  target type of m0
     * @param <T1>  target type of m1
     * @param <T2>  target type of m2
     * @param <T3>  target type of m3
     * @param <T4>  target type of m4
     * @param <T5>  target type of m5
     * @param <T6>  target type of m6
     * @param <T7>  target type of m7
     * @param <T8>  target type of m8
     * @param <T9>  target type of m9
     * @param <T10> target type of m10
     * @param <T11> target type of m11
     * @param <T12> target type of m12
     * @param <T13> target type of m13
     * @param <T14> target type of m14
     * @param <T15> target type of m15
     * @param <T16> target type of m16
     * @param <T17> target type of m17
     * @param m0    mapper to apply for Tuple18's element 0
     * @param m1    mapper to apply for Tuple18's element 1
     * @param m2    mapper to apply for Tuple18's element 2
     * @param m3    mapper to apply for Tuple18's element 3
     * @param m4    mapper to apply for Tuple18's element 4
     * @param m5    mapper to apply for Tuple18's element 5
     * @param m6    mapper to apply for Tuple18's element 6
     * @param m7    mapper to apply for Tuple18's element 7
     * @param m8    mapper to apply for Tuple18's element 8
     * @param m9    mapper to apply for Tuple18's element 9
     * @param m10   mapper to apply for Tuple18's element 10
     * @param m11   mapper to apply for Tuple18's element 11
     * @param m12   mapper to apply for Tuple18's element 12
     * @param m13   mapper to apply for Tuple18's element 13
     * @param m14   mapper to apply for Tuple18's element 14
     * @param m15   mapper to apply for Tuple18's element 15
     * @param m16   mapper to apply for Tuple18's element 16
     * @param m17   mapper to apply for Tuple18's element 17
     * @return      a Function that, when applied, creates a {@link Tuple18}
     *              from an initial object of type T by applying the given
     *              mappers.
     * 
     * @see Tuple18
     * @see Tuple
     */
    public static <T, T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> Function<T, Tuple18<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>> toTuple(
            Function<T, T0> m0,
            Function<T, T1> m1,
            Function<T, T2> m2,
            Function<T, T3> m3,
            Function<T, T4> m4,
            Function<T, T5> m5,
            Function<T, T6> m6,
            Function<T, T7> m7,
            Function<T, T8> m8,
            Function<T, T9> m9,
            Function<T, T10> m10,
            Function<T, T11> m11,
            Function<T, T12> m12,
            Function<T, T13> m13,
            Function<T, T14> m14,
            Function<T, T15> m15,
            Function<T, T16> m16,
            Function<T, T17> m17) {
        return new Tuple18MapperImpl<>(m0, m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12, m13, m14, m15, m16, m17);
    }
    
    /**
     * Creates and returns a {@link Tuple19} with the given parameters.
     * 
     * @param <T0>  type of element 0
     * @param <T1>  type of element 1
     * @param <T2>  type of element 2
     * @param <T3>  type of element 3
     * @param <T4>  type of element 4
     * @param <T5>  type of element 5
     * @param <T6>  type of element 6
     * @param <T7>  type of element 7
     * @param <T8>  type of element 8
     * @param <T9>  type of element 9
     * @param <T10> type of element 10
     * @param <T11> type of element 11
     * @param <T12> type of element 12
     * @param <T13> type of element 13
     * @param <T14> type of element 14
     * @param <T15> type of element 15
     * @param <T16> type of element 16
     * @param <T17> type of element 17
     * @param <T18> type of element 18
     * @param e0    element 0
     * @param e1    element 1
     * @param e2    element 2
     * @param e3    element 3
     * @param e4    element 4
     * @param e5    element 5
     * @param e6    element 6
     * @param e7    element 7
     * @param e8    element 8
     * @param e9    element 9
     * @param e10   element 10
     * @param e11   element 11
     * @param e12   element 12
     * @param e13   element 13
     * @param e14   element 14
     * @param e15   element 15
     * @param e16   element 16
     * @param e17   element 17
     * @param e18   element 18
     * @return      a {@link Tuple19} with the given parameters.
     * 
     * @see Tuple19
     * @see Tuple
     */
    public static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> Tuple19<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> of(
            T0 e0,
            T1 e1,
            T2 e2,
            T3 e3,
            T4 e4,
            T5 e5,
            T6 e6,
            T7 e7,
            T8 e8,
            T9 e9,
            T10 e10,
            T11 e11,
            T12 e12,
            T13 e13,
            T14 e14,
            T15 e15,
            T16 e16,
            T17 e17,
            T18 e18) {
        return new Tuple19Impl<>(e0, e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18);
    }
    
    /**
     * Creates and returns a Function that, when applied, creates a {@link
     * Tuple19} from an initial object of type T by applying the given mappers.
     * 
     * @param <T>   type of the initial object to be used by the function to
     *              create a {@link Tuple19 }
     * @param <T0>  target type of m0
     * @param <T1>  target type of m1
     * @param <T2>  target type of m2
     * @param <T3>  target type of m3
     * @param <T4>  target type of m4
     * @param <T5>  target type of m5
     * @param <T6>  target type of m6
     * @param <T7>  target type of m7
     * @param <T8>  target type of m8
     * @param <T9>  target type of m9
     * @param <T10> target type of m10
     * @param <T11> target type of m11
     * @param <T12> target type of m12
     * @param <T13> target type of m13
     * @param <T14> target type of m14
     * @param <T15> target type of m15
     * @param <T16> target type of m16
     * @param <T17> target type of m17
     * @param <T18> target type of m18
     * @param m0    mapper to apply for Tuple19's element 0
     * @param m1    mapper to apply for Tuple19's element 1
     * @param m2    mapper to apply for Tuple19's element 2
     * @param m3    mapper to apply for Tuple19's element 3
     * @param m4    mapper to apply for Tuple19's element 4
     * @param m5    mapper to apply for Tuple19's element 5
     * @param m6    mapper to apply for Tuple19's element 6
     * @param m7    mapper to apply for Tuple19's element 7
     * @param m8    mapper to apply for Tuple19's element 8
     * @param m9    mapper to apply for Tuple19's element 9
     * @param m10   mapper to apply for Tuple19's element 10
     * @param m11   mapper to apply for Tuple19's element 11
     * @param m12   mapper to apply for Tuple19's element 12
     * @param m13   mapper to apply for Tuple19's element 13
     * @param m14   mapper to apply for Tuple19's element 14
     * @param m15   mapper to apply for Tuple19's element 15
     * @param m16   mapper to apply for Tuple19's element 16
     * @param m17   mapper to apply for Tuple19's element 17
     * @param m18   mapper to apply for Tuple19's element 18
     * @return      a Function that, when applied, creates a {@link Tuple19}
     *              from an initial object of type T by applying the given
     *              mappers.
     * 
     * @see Tuple19
     * @see Tuple
     */
    public static <T, T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> Function<T, Tuple19<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>> toTuple(
            Function<T, T0> m0,
            Function<T, T1> m1,
            Function<T, T2> m2,
            Function<T, T3> m3,
            Function<T, T4> m4,
            Function<T, T5> m5,
            Function<T, T6> m6,
            Function<T, T7> m7,
            Function<T, T8> m8,
            Function<T, T9> m9,
            Function<T, T10> m10,
            Function<T, T11> m11,
            Function<T, T12> m12,
            Function<T, T13> m13,
            Function<T, T14> m14,
            Function<T, T15> m15,
            Function<T, T16> m16,
            Function<T, T17> m17,
            Function<T, T18> m18) {
        return new Tuple19MapperImpl<>(m0, m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12, m13, m14, m15, m16, m17, m18);
    }
    
    /**
     * Creates and returns a {@link Tuple20} with the given parameters.
     * 
     * @param <T0>  type of element 0
     * @param <T1>  type of element 1
     * @param <T2>  type of element 2
     * @param <T3>  type of element 3
     * @param <T4>  type of element 4
     * @param <T5>  type of element 5
     * @param <T6>  type of element 6
     * @param <T7>  type of element 7
     * @param <T8>  type of element 8
     * @param <T9>  type of element 9
     * @param <T10> type of element 10
     * @param <T11> type of element 11
     * @param <T12> type of element 12
     * @param <T13> type of element 13
     * @param <T14> type of element 14
     * @param <T15> type of element 15
     * @param <T16> type of element 16
     * @param <T17> type of element 17
     * @param <T18> type of element 18
     * @param <T19> type of element 19
     * @param e0    element 0
     * @param e1    element 1
     * @param e2    element 2
     * @param e3    element 3
     * @param e4    element 4
     * @param e5    element 5
     * @param e6    element 6
     * @param e7    element 7
     * @param e8    element 8
     * @param e9    element 9
     * @param e10   element 10
     * @param e11   element 11
     * @param e12   element 12
     * @param e13   element 13
     * @param e14   element 14
     * @param e15   element 15
     * @param e16   element 16
     * @param e17   element 17
     * @param e18   element 18
     * @param e19   element 19
     * @return      a {@link Tuple20} with the given parameters.
     * 
     * @see Tuple20
     * @see Tuple
     */
    public static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> Tuple20<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> of(
            T0 e0,
            T1 e1,
            T2 e2,
            T3 e3,
            T4 e4,
            T5 e5,
            T6 e6,
            T7 e7,
            T8 e8,
            T9 e9,
            T10 e10,
            T11 e11,
            T12 e12,
            T13 e13,
            T14 e14,
            T15 e15,
            T16 e16,
            T17 e17,
            T18 e18,
            T19 e19) {
        return new Tuple20Impl<>(e0, e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19);
    }
    
    /**
     * Creates and returns a Function that, when applied, creates a {@link
     * Tuple20} from an initial object of type T by applying the given mappers.
     * 
     * @param <T>   type of the initial object to be used by the function to
     *              create a {@link Tuple20 }
     * @param <T0>  target type of m0
     * @param <T1>  target type of m1
     * @param <T2>  target type of m2
     * @param <T3>  target type of m3
     * @param <T4>  target type of m4
     * @param <T5>  target type of m5
     * @param <T6>  target type of m6
     * @param <T7>  target type of m7
     * @param <T8>  target type of m8
     * @param <T9>  target type of m9
     * @param <T10> target type of m10
     * @param <T11> target type of m11
     * @param <T12> target type of m12
     * @param <T13> target type of m13
     * @param <T14> target type of m14
     * @param <T15> target type of m15
     * @param <T16> target type of m16
     * @param <T17> target type of m17
     * @param <T18> target type of m18
     * @param <T19> target type of m19
     * @param m0    mapper to apply for Tuple20's element 0
     * @param m1    mapper to apply for Tuple20's element 1
     * @param m2    mapper to apply for Tuple20's element 2
     * @param m3    mapper to apply for Tuple20's element 3
     * @param m4    mapper to apply for Tuple20's element 4
     * @param m5    mapper to apply for Tuple20's element 5
     * @param m6    mapper to apply for Tuple20's element 6
     * @param m7    mapper to apply for Tuple20's element 7
     * @param m8    mapper to apply for Tuple20's element 8
     * @param m9    mapper to apply for Tuple20's element 9
     * @param m10   mapper to apply for Tuple20's element 10
     * @param m11   mapper to apply for Tuple20's element 11
     * @param m12   mapper to apply for Tuple20's element 12
     * @param m13   mapper to apply for Tuple20's element 13
     * @param m14   mapper to apply for Tuple20's element 14
     * @param m15   mapper to apply for Tuple20's element 15
     * @param m16   mapper to apply for Tuple20's element 16
     * @param m17   mapper to apply for Tuple20's element 17
     * @param m18   mapper to apply for Tuple20's element 18
     * @param m19   mapper to apply for Tuple20's element 19
     * @return      a Function that, when applied, creates a {@link Tuple20}
     *              from an initial object of type T by applying the given
     *              mappers.
     * 
     * @see Tuple20
     * @see Tuple
     */
    public static <T, T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> Function<T, Tuple20<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>> toTuple(
            Function<T, T0> m0,
            Function<T, T1> m1,
            Function<T, T2> m2,
            Function<T, T3> m3,
            Function<T, T4> m4,
            Function<T, T5> m5,
            Function<T, T6> m6,
            Function<T, T7> m7,
            Function<T, T8> m8,
            Function<T, T9> m9,
            Function<T, T10> m10,
            Function<T, T11> m11,
            Function<T, T12> m12,
            Function<T, T13> m13,
            Function<T, T14> m14,
            Function<T, T15> m15,
            Function<T, T16> m16,
            Function<T, T17> m17,
            Function<T, T18> m18,
            Function<T, T19> m19) {
        return new Tuple20MapperImpl<>(m0, m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12, m13, m14, m15, m16, m17, m18, m19);
    }
    
    /**
     * Creates and returns a {@link Tuple21} with the given parameters.
     * 
     * @param <T0>  type of element 0
     * @param <T1>  type of element 1
     * @param <T2>  type of element 2
     * @param <T3>  type of element 3
     * @param <T4>  type of element 4
     * @param <T5>  type of element 5
     * @param <T6>  type of element 6
     * @param <T7>  type of element 7
     * @param <T8>  type of element 8
     * @param <T9>  type of element 9
     * @param <T10> type of element 10
     * @param <T11> type of element 11
     * @param <T12> type of element 12
     * @param <T13> type of element 13
     * @param <T14> type of element 14
     * @param <T15> type of element 15
     * @param <T16> type of element 16
     * @param <T17> type of element 17
     * @param <T18> type of element 18
     * @param <T19> type of element 19
     * @param <T20> type of element 20
     * @param e0    element 0
     * @param e1    element 1
     * @param e2    element 2
     * @param e3    element 3
     * @param e4    element 4
     * @param e5    element 5
     * @param e6    element 6
     * @param e7    element 7
     * @param e8    element 8
     * @param e9    element 9
     * @param e10   element 10
     * @param e11   element 11
     * @param e12   element 12
     * @param e13   element 13
     * @param e14   element 14
     * @param e15   element 15
     * @param e16   element 16
     * @param e17   element 17
     * @param e18   element 18
     * @param e19   element 19
     * @param e20   element 20
     * @return      a {@link Tuple21} with the given parameters.
     * 
     * @see Tuple21
     * @see Tuple
     */
    public static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> Tuple21<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> of(
            T0 e0,
            T1 e1,
            T2 e2,
            T3 e3,
            T4 e4,
            T5 e5,
            T6 e6,
            T7 e7,
            T8 e8,
            T9 e9,
            T10 e10,
            T11 e11,
            T12 e12,
            T13 e13,
            T14 e14,
            T15 e15,
            T16 e16,
            T17 e17,
            T18 e18,
            T19 e19,
            T20 e20) {
        return new Tuple21Impl<>(e0, e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20);
    }
    
    /**
     * Creates and returns a Function that, when applied, creates a {@link
     * Tuple21} from an initial object of type T by applying the given mappers.
     * 
     * @param <T>   type of the initial object to be used by the function to
     *              create a {@link Tuple21 }
     * @param <T0>  target type of m0
     * @param <T1>  target type of m1
     * @param <T2>  target type of m2
     * @param <T3>  target type of m3
     * @param <T4>  target type of m4
     * @param <T5>  target type of m5
     * @param <T6>  target type of m6
     * @param <T7>  target type of m7
     * @param <T8>  target type of m8
     * @param <T9>  target type of m9
     * @param <T10> target type of m10
     * @param <T11> target type of m11
     * @param <T12> target type of m12
     * @param <T13> target type of m13
     * @param <T14> target type of m14
     * @param <T15> target type of m15
     * @param <T16> target type of m16
     * @param <T17> target type of m17
     * @param <T18> target type of m18
     * @param <T19> target type of m19
     * @param <T20> target type of m20
     * @param m0    mapper to apply for Tuple21's element 0
     * @param m1    mapper to apply for Tuple21's element 1
     * @param m2    mapper to apply for Tuple21's element 2
     * @param m3    mapper to apply for Tuple21's element 3
     * @param m4    mapper to apply for Tuple21's element 4
     * @param m5    mapper to apply for Tuple21's element 5
     * @param m6    mapper to apply for Tuple21's element 6
     * @param m7    mapper to apply for Tuple21's element 7
     * @param m8    mapper to apply for Tuple21's element 8
     * @param m9    mapper to apply for Tuple21's element 9
     * @param m10   mapper to apply for Tuple21's element 10
     * @param m11   mapper to apply for Tuple21's element 11
     * @param m12   mapper to apply for Tuple21's element 12
     * @param m13   mapper to apply for Tuple21's element 13
     * @param m14   mapper to apply for Tuple21's element 14
     * @param m15   mapper to apply for Tuple21's element 15
     * @param m16   mapper to apply for Tuple21's element 16
     * @param m17   mapper to apply for Tuple21's element 17
     * @param m18   mapper to apply for Tuple21's element 18
     * @param m19   mapper to apply for Tuple21's element 19
     * @param m20   mapper to apply for Tuple21's element 20
     * @return      a Function that, when applied, creates a {@link Tuple21}
     *              from an initial object of type T by applying the given
     *              mappers.
     * 
     * @see Tuple21
     * @see Tuple
     */
    public static <T, T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> Function<T, Tuple21<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20>> toTuple(
            Function<T, T0> m0,
            Function<T, T1> m1,
            Function<T, T2> m2,
            Function<T, T3> m3,
            Function<T, T4> m4,
            Function<T, T5> m5,
            Function<T, T6> m6,
            Function<T, T7> m7,
            Function<T, T8> m8,
            Function<T, T9> m9,
            Function<T, T10> m10,
            Function<T, T11> m11,
            Function<T, T12> m12,
            Function<T, T13> m13,
            Function<T, T14> m14,
            Function<T, T15> m15,
            Function<T, T16> m16,
            Function<T, T17> m17,
            Function<T, T18> m18,
            Function<T, T19> m19,
            Function<T, T20> m20) {
        return new Tuple21MapperImpl<>(m0, m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12, m13, m14, m15, m16, m17, m18, m19, m20);
    }
    
    /**
     * Creates and returns a {@link Tuple22} with the given parameters.
     * 
     * @param <T0>  type of element 0
     * @param <T1>  type of element 1
     * @param <T2>  type of element 2
     * @param <T3>  type of element 3
     * @param <T4>  type of element 4
     * @param <T5>  type of element 5
     * @param <T6>  type of element 6
     * @param <T7>  type of element 7
     * @param <T8>  type of element 8
     * @param <T9>  type of element 9
     * @param <T10> type of element 10
     * @param <T11> type of element 11
     * @param <T12> type of element 12
     * @param <T13> type of element 13
     * @param <T14> type of element 14
     * @param <T15> type of element 15
     * @param <T16> type of element 16
     * @param <T17> type of element 17
     * @param <T18> type of element 18
     * @param <T19> type of element 19
     * @param <T20> type of element 20
     * @param <T21> type of element 21
     * @param e0    element 0
     * @param e1    element 1
     * @param e2    element 2
     * @param e3    element 3
     * @param e4    element 4
     * @param e5    element 5
     * @param e6    element 6
     * @param e7    element 7
     * @param e8    element 8
     * @param e9    element 9
     * @param e10   element 10
     * @param e11   element 11
     * @param e12   element 12
     * @param e13   element 13
     * @param e14   element 14
     * @param e15   element 15
     * @param e16   element 16
     * @param e17   element 17
     * @param e18   element 18
     * @param e19   element 19
     * @param e20   element 20
     * @param e21   element 21
     * @return      a {@link Tuple22} with the given parameters.
     * 
     * @see Tuple22
     * @see Tuple
     */
    public static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> Tuple22<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> of(
            T0 e0,
            T1 e1,
            T2 e2,
            T3 e3,
            T4 e4,
            T5 e5,
            T6 e6,
            T7 e7,
            T8 e8,
            T9 e9,
            T10 e10,
            T11 e11,
            T12 e12,
            T13 e13,
            T14 e14,
            T15 e15,
            T16 e16,
            T17 e17,
            T18 e18,
            T19 e19,
            T20 e20,
            T21 e21) {
        return new Tuple22Impl<>(e0, e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20, e21);
    }
    
    /**
     * Creates and returns a Function that, when applied, creates a {@link
     * Tuple22} from an initial object of type T by applying the given mappers.
     * 
     * @param <T>   type of the initial object to be used by the function to
     *              create a {@link Tuple22 }
     * @param <T0>  target type of m0
     * @param <T1>  target type of m1
     * @param <T2>  target type of m2
     * @param <T3>  target type of m3
     * @param <T4>  target type of m4
     * @param <T5>  target type of m5
     * @param <T6>  target type of m6
     * @param <T7>  target type of m7
     * @param <T8>  target type of m8
     * @param <T9>  target type of m9
     * @param <T10> target type of m10
     * @param <T11> target type of m11
     * @param <T12> target type of m12
     * @param <T13> target type of m13
     * @param <T14> target type of m14
     * @param <T15> target type of m15
     * @param <T16> target type of m16
     * @param <T17> target type of m17
     * @param <T18> target type of m18
     * @param <T19> target type of m19
     * @param <T20> target type of m20
     * @param <T21> target type of m21
     * @param m0    mapper to apply for Tuple22's element 0
     * @param m1    mapper to apply for Tuple22's element 1
     * @param m2    mapper to apply for Tuple22's element 2
     * @param m3    mapper to apply for Tuple22's element 3
     * @param m4    mapper to apply for Tuple22's element 4
     * @param m5    mapper to apply for Tuple22's element 5
     * @param m6    mapper to apply for Tuple22's element 6
     * @param m7    mapper to apply for Tuple22's element 7
     * @param m8    mapper to apply for Tuple22's element 8
     * @param m9    mapper to apply for Tuple22's element 9
     * @param m10   mapper to apply for Tuple22's element 10
     * @param m11   mapper to apply for Tuple22's element 11
     * @param m12   mapper to apply for Tuple22's element 12
     * @param m13   mapper to apply for Tuple22's element 13
     * @param m14   mapper to apply for Tuple22's element 14
     * @param m15   mapper to apply for Tuple22's element 15
     * @param m16   mapper to apply for Tuple22's element 16
     * @param m17   mapper to apply for Tuple22's element 17
     * @param m18   mapper to apply for Tuple22's element 18
     * @param m19   mapper to apply for Tuple22's element 19
     * @param m20   mapper to apply for Tuple22's element 20
     * @param m21   mapper to apply for Tuple22's element 21
     * @return      a Function that, when applied, creates a {@link Tuple22}
     *              from an initial object of type T by applying the given
     *              mappers.
     * 
     * @see Tuple22
     * @see Tuple
     */
    public static <T, T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> Function<T, Tuple22<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>> toTuple(
            Function<T, T0> m0,
            Function<T, T1> m1,
            Function<T, T2> m2,
            Function<T, T3> m3,
            Function<T, T4> m4,
            Function<T, T5> m5,
            Function<T, T6> m6,
            Function<T, T7> m7,
            Function<T, T8> m8,
            Function<T, T9> m9,
            Function<T, T10> m10,
            Function<T, T11> m11,
            Function<T, T12> m12,
            Function<T, T13> m13,
            Function<T, T14> m14,
            Function<T, T15> m15,
            Function<T, T16> m16,
            Function<T, T17> m17,
            Function<T, T18> m18,
            Function<T, T19> m19,
            Function<T, T20> m20,
            Function<T, T21> m21) {
        return new Tuple22MapperImpl<>(m0, m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12, m13, m14, m15, m16, m17, m18, m19, m20, m21);
    }
    
    /**
     * Creates and returns a {@link Tuple23} with the given parameters.
     * 
     * @param <T0>  type of element 0
     * @param <T1>  type of element 1
     * @param <T2>  type of element 2
     * @param <T3>  type of element 3
     * @param <T4>  type of element 4
     * @param <T5>  type of element 5
     * @param <T6>  type of element 6
     * @param <T7>  type of element 7
     * @param <T8>  type of element 8
     * @param <T9>  type of element 9
     * @param <T10> type of element 10
     * @param <T11> type of element 11
     * @param <T12> type of element 12
     * @param <T13> type of element 13
     * @param <T14> type of element 14
     * @param <T15> type of element 15
     * @param <T16> type of element 16
     * @param <T17> type of element 17
     * @param <T18> type of element 18
     * @param <T19> type of element 19
     * @param <T20> type of element 20
     * @param <T21> type of element 21
     * @param <T22> type of element 22
     * @param e0    element 0
     * @param e1    element 1
     * @param e2    element 2
     * @param e3    element 3
     * @param e4    element 4
     * @param e5    element 5
     * @param e6    element 6
     * @param e7    element 7
     * @param e8    element 8
     * @param e9    element 9
     * @param e10   element 10
     * @param e11   element 11
     * @param e12   element 12
     * @param e13   element 13
     * @param e14   element 14
     * @param e15   element 15
     * @param e16   element 16
     * @param e17   element 17
     * @param e18   element 18
     * @param e19   element 19
     * @param e20   element 20
     * @param e21   element 21
     * @param e22   element 22
     * @return      a {@link Tuple23} with the given parameters.
     * 
     * @see Tuple23
     * @see Tuple
     */
    public static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> Tuple23<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> of(
            T0 e0,
            T1 e1,
            T2 e2,
            T3 e3,
            T4 e4,
            T5 e5,
            T6 e6,
            T7 e7,
            T8 e8,
            T9 e9,
            T10 e10,
            T11 e11,
            T12 e12,
            T13 e13,
            T14 e14,
            T15 e15,
            T16 e16,
            T17 e17,
            T18 e18,
            T19 e19,
            T20 e20,
            T21 e21,
            T22 e22) {
        return new Tuple23Impl<>(e0, e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20, e21, e22);
    }
    
    /**
     * Creates and returns a Function that, when applied, creates a {@link
     * Tuple23} from an initial object of type T by applying the given mappers.
     * 
     * @param <T>   type of the initial object to be used by the function to
     *              create a {@link Tuple23 }
     * @param <T0>  target type of m0
     * @param <T1>  target type of m1
     * @param <T2>  target type of m2
     * @param <T3>  target type of m3
     * @param <T4>  target type of m4
     * @param <T5>  target type of m5
     * @param <T6>  target type of m6
     * @param <T7>  target type of m7
     * @param <T8>  target type of m8
     * @param <T9>  target type of m9
     * @param <T10> target type of m10
     * @param <T11> target type of m11
     * @param <T12> target type of m12
     * @param <T13> target type of m13
     * @param <T14> target type of m14
     * @param <T15> target type of m15
     * @param <T16> target type of m16
     * @param <T17> target type of m17
     * @param <T18> target type of m18
     * @param <T19> target type of m19
     * @param <T20> target type of m20
     * @param <T21> target type of m21
     * @param <T22> target type of m22
     * @param m0    mapper to apply for Tuple23's element 0
     * @param m1    mapper to apply for Tuple23's element 1
     * @param m2    mapper to apply for Tuple23's element 2
     * @param m3    mapper to apply for Tuple23's element 3
     * @param m4    mapper to apply for Tuple23's element 4
     * @param m5    mapper to apply for Tuple23's element 5
     * @param m6    mapper to apply for Tuple23's element 6
     * @param m7    mapper to apply for Tuple23's element 7
     * @param m8    mapper to apply for Tuple23's element 8
     * @param m9    mapper to apply for Tuple23's element 9
     * @param m10   mapper to apply for Tuple23's element 10
     * @param m11   mapper to apply for Tuple23's element 11
     * @param m12   mapper to apply for Tuple23's element 12
     * @param m13   mapper to apply for Tuple23's element 13
     * @param m14   mapper to apply for Tuple23's element 14
     * @param m15   mapper to apply for Tuple23's element 15
     * @param m16   mapper to apply for Tuple23's element 16
     * @param m17   mapper to apply for Tuple23's element 17
     * @param m18   mapper to apply for Tuple23's element 18
     * @param m19   mapper to apply for Tuple23's element 19
     * @param m20   mapper to apply for Tuple23's element 20
     * @param m21   mapper to apply for Tuple23's element 21
     * @param m22   mapper to apply for Tuple23's element 22
     * @return      a Function that, when applied, creates a {@link Tuple23}
     *              from an initial object of type T by applying the given
     *              mappers.
     * 
     * @see Tuple23
     * @see Tuple
     */
    public static <T, T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> Function<T, Tuple23<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>> toTuple(
            Function<T, T0> m0,
            Function<T, T1> m1,
            Function<T, T2> m2,
            Function<T, T3> m3,
            Function<T, T4> m4,
            Function<T, T5> m5,
            Function<T, T6> m6,
            Function<T, T7> m7,
            Function<T, T8> m8,
            Function<T, T9> m9,
            Function<T, T10> m10,
            Function<T, T11> m11,
            Function<T, T12> m12,
            Function<T, T13> m13,
            Function<T, T14> m14,
            Function<T, T15> m15,
            Function<T, T16> m16,
            Function<T, T17> m17,
            Function<T, T18> m18,
            Function<T, T19> m19,
            Function<T, T20> m20,
            Function<T, T21> m21,
            Function<T, T22> m22) {
        return new Tuple23MapperImpl<>(m0, m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12, m13, m14, m15, m16, m17, m18, m19, m20, m21, m22);
    }
}