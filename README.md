Introduction
------------

This is a cleanroom implementation of the Findbugs Annotations.

I started by taking the Javadoc of the findbugs annotations and
added in some of the missing information from
  http://findbugs.sourceforge.net/manual/annotations.html

At no time did I look at the original Findbugs source code.

Rational
--------

The Findbugs Annotations are really useful, however they are released
under the LGPL license, which some people are banned from using due to
corporate licensing policies.

Using the Findbugs annotations can be considered by some lawyers as
static linking with those annotations (IANAL so I don't know if they are
correct or not).  If they are correct (and some might say it's a big if)
then using the LGPL version of the annotations would make your code
a "derivative work" (which is f*cking nuts because you should be
able to just swap in this version now shouldn't you)

So, if you have some idiot lawyers who won't let you use Findbugs'
annotations.jar, then side-step them and use this one and keep the bugs
out of your code.
