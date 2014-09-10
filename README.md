TestPlugin
==========

This is an example plugin that works with IngotAPI. It cancels any PlayerKickEvent if the username of the player being kicked is "dreadiscool"

In order to register an event, you must register a class that implements EventHandler. When you register a class, it is scanned for all functions that take an event as a parameter. For example, if you have the function ingotServerIsAwesome(PlayerKickEvent), the method will be stored and invoked whenever a kick event comes through.

It's important to note that the name you give your functions does not matter - the plugin loader will scan for functions based on the arguments they take, and not the name.