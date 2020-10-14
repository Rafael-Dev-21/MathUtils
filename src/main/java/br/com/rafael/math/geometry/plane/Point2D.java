package br.com.rafael.math.geometry.plane;
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
 * If not, see &#60;https://www.gnu.org/licenses/ &#62;.
 */
import br.com.rafael.math.geometry.plane.Point2D;

import java.io.Serializable;

public class Point2D implements Cloneable, Serializable {

  private static final long serialVersionUID = 0L;

  private double _x;
  private double _y;

  public Point2D() {
    _x = _y = 0;
  }

  public Point2D(double x, double y) {
    _x = x;
    _y = y;
  }

  public void setX(double x) {
    _x = x;
  }

  public void setY(double y) {
    _y = y;
  }

  public double getX() {
    return _x;
  }

  public double getY() {
    return _y;
  }

  public double distance(Point2D other) {
    double disX = _x - other._x;
    double disY = _y - other._y;

    return Math.sqrt(disX * disX + disY * disY);
  }

  public boolean isCollide(Point2D other) {
    return this.equals(other) && this != other;
  }

  @Override
  public Point2D clone() {
    try {
      return (Point2D) super.clone();
    } catch (CloneNotSupportedException e) {
      throw new AssertionError();
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof Point2D)) return false;
    Point2D point = (Point2D) o;
    return this._x == point._x && this._y == point._y;
  }

  @Override
  public int hashCode() {
    int result = 17;

    result = result * 31 + hashDouble(_x);
    result = result * 31 + hashDouble(_y);

    return result;
  }

  private int hashDouble(double d) {
    long longBits = Double.doubleToLongBits(d);
    return (int) (longBits ^ (longBits >>> 32));
  }

  @Override
  public String toString() {
    return "[" + _x + ", " + _y + "]";
  }
}
