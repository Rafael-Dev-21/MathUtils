package br.com.rafael.math.geometry.plane;
/**
 * Copyright© 2020 Victor Rafael Pereira Alves This file is part of MathUtils.
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
 * If not, see &#60;https://www.gnu.org/licenses/&#62;.
 */
import br.com.rafael.math.geometry.plane.Circle;
import br.com.rafael.math.geometry.plane.Point2D;

import java.io.Serializable;

public class Circle implements Cloneable, Comparable<Circle>, Serializable {

  private static final long serialVersionUID = 0l;

  private Point2D _point;
  private double _radius;

  public Circle() {
    _point = new Point2D();
    _radius = 0;
  }

  public Circle(double radius) {
    this(0, 0, radius);
  }

  public Circle(double x, double y) {
    this(x, y, 0);
  }

  public Circle(double x, double y, double radius) {
    this(new Point2D(x, y), radius);
  }

  public Circle(Point2D point) {
    this(point, 0);
  }

  public Circle(Point2D point, double radius) {
    _point = point;
    _radius = radius;
  }

  public void setX(double x) {
    _point.setX(x);
  }

  public void setY(double y) {
    _point.setY(y);
  }

  public double getX() {
    return _point.getX();
  }

  public double getY() {
    return _point.getY();
  }

  public void setPosition(float x, float y) {
    _point = new Point2D(x, y);
  }

  public Point2D getPosition() {
    return _point.clone();
  }

  public void setRadius(double r) {
    _radius = r;
  }

  public double getRadius() {
    return _radius;
  }

  public double getArea() {
    return _radius * _radius * Math.PI;
  }

  public double getPerimeter() {
    return _radius * Math.PI * 2;
  }

  public boolean isCollide(Circle other) {
    return _point.distance(other._point) < _radius + other._radius;
  }

  public boolean isCollide(Point2D point) {
    return _point.distance(point) < _radius;
  }

  @Override
  public Circle clone() {
    try {
      Circle clone = (Circle) super.clone();
      clone._point = _point.clone();

      return clone;
    } catch (CloneNotSupportedException e) {
      throw new AssertionError();
    }
  }

  @Override
  public int compareTo(Circle other) {
    return (int) (_radius - other._radius);
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    if (!(other instanceof Circle)) return false;
    Circle circle = (Circle) other;
    return this._radius == circle._radius && this._point.equals(circle._point);
  }

  @Override
  public int hashCode() {
    int result = 17;

    result = result * 31 + _point.hashCode();
    result = result * 31 + hashDouble(_radius);

    return result;
  }

  public int hashDouble(double d) {
    long longBits = Double.doubleToLongBits(d);

    return (int) (longBits ^ (longBits >>> 32));
  }

  @Override
  public String toString() {
    return "{point: " + _point + ", radius: " + _radius + "}";
  }
}
