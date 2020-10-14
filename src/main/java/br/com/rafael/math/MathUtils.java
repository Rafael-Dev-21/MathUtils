package br.com.rafael.math;
/**
 * Copyright© 2020 Victor Rafael Pereira Alves
 *
 * <p>This file is part of MathUtils.
 *
 * <p>MathUtils is free software: you can redistribute it and/or modify it under the terms of the
 * Lesser GNU General Public License as published by the Free Software Foundation, either version 3
 * of the License, or (at your option) any later version.
 *
 * <p>MathUtils is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the Lesser
 * GNU General Public License for more details.
 *
 * <p>You should have received a copy of the Lesser GNU General Public License along with MathUtils.
 * If not, see &#60; https://www.gnu.org/licenses/ &#62;.
 */

import br.com.rafael.math.vector.Vector2D;
import br.com.rafael.math.vector.Vector3D;

public final class MathUtils {

  public static final double normalize(double value, double min, double max) {
    return (value - min) / (max - min);
  }

  public static final byte lerp(double v, byte in0, byte in1) {
    return (byte) (in0 + v * (in1 - in0));
  }

  public static final short lerp(double v, short in0, short in1) {
    return (short) (in0 + v * (in1 - in0));
  }

  public static final int lerp(double v, int in0, int in1) {
    return (int) (in0 + v * (in1 - in0));
  }

  public static final long lerp(double v, long in0, long in1) {
    return (long) (in0 + v * (in1 - in0));
  }

  public static final float lerp(double v, float in0, float in1) {
    return (float) (in0 + v * (in1 - in0));
  }

  public static final double lerp(double v, double in0, double in1) {
    return in0 + v * (in1 - in0);
  }

  public static final byte resize(byte value, byte in0, byte in1, byte out0, byte out1) {
    double normal = normalize(value, in0, in1);
    byte result = lerp(normal, out0, out1);
    return result;
  }

  public static final short resize(short value, short in0, short in1, short out0, short out1) {
    double normal = normalize(value, in0, in1);
    short result = lerp(normal, out0, out1);
    return result;
  }

  public static final int resize(int value, int in0, int in1, int out0, int out1) {
    double normal = normalize(value, in0, in1);
    int result = lerp(normal, out0, out1);
    return result;
  }

  public static final long resize(long value, long in0, long in1, long out0, long out1) {
    double normal = normalize(value, in0, in1);
    long result = lerp(normal, out0, out1);
    return result;
  }

  public static final float resize(float value, float in0, float in1, float out0, float out1) {
    double normal = normalize(value, in0, in1);
    float result = lerp(normal, out0, out1);
    return result;
  }

  public static final double resize(
      double value, double in0, double in1, double out0, double out1) {
    double normal = normalize(value, in0, in1);
    double result = lerp(normal, out0, out1);
    return result;
  }

  public static final Vector2D truncate(Vector2D vector, double size) {
    return vector.size() > size ? vector.resize(size) : vector;
  }

  public static final Vector3D truncate(Vector3D vector, double size) {
    return vector.size() > size ? vector.resize(size) : vector;
  }
}
