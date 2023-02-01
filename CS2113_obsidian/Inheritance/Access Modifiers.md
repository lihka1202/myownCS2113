These help in determining if other classes can use a particular field or a method
This can be determined across a couple of levels:
- **At the class level**
	- **Public**: The class is visible to all other classes
	- **No modifier**: This works the same as **Public**
- **At the member level**:
	- **Public**: The class is visible to all other classes
	- **Protected**: same as public, *Very weird?*
	- **No modifier**: same as public
	- **Private**: The member is not visible to any other class *but can be accessed by its own class*.
- 