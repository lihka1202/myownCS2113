
Another weird one if you ask me

```java
function setDimension(name, value) {
  if (name === "height") {
    this._height = value;
    return;
  }
  if (name === "width") {
    this._width = value;
    return;
  }
}
```

```java
function setHeight(value) {this._height = value;}
function setWidth (value) {this._width = value;}
```

Hmm, in java, you could just use 2 different functions always, this is a bad idea as it creates more confusion and the function signature is quite messy

