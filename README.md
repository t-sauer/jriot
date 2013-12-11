jriot
=====
jriot is a java library you can use to access Riot's new API without handling any HTTP requests or JSON objects at all.

In order to use jriot you also need gson. You can get gson from https://code.google.com/p/google-gson/.

jriot is very easy to use. Just add it to your project and start with something like this:

```
JRiot lol = new JRiot();
lol.setApiKey("YOUR_API_KEY_HERE");
lol.setRegion("euw");
Summoner yourSummoner = lol.getSummoner("Coizu");
```
It's pretty much the same as accessing the API directly, so the naming for the methods should be pretty easy to get. Maybe I will add a documentation in the next few days if it's needed.

This product is not endorsed, certified or otherwise approved in any way by Riot Games, Inc. or any of its affiliates.
