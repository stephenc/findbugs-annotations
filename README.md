Introduction
------------

This is a cleanroom implementation of the Findbugs Annotations with the JSR305 deprecations removed.

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

Rational for removing deprecations
----------------------------------

[JSR-305](https://jcp.org/en/jsr/detail?id=305) is dormant, has been for a long while and shows no hope of ever 
producing an agreed set of annotations. Further more these annotations use `javax.` packages which it is not possible 
to use according to the 
[Oracle Java binary licence](http://www.oracle.com/technetwork/java/javase/terms/license/index.html), so applications 
can not use and ship these dependencies along with a JRE without violating the Oracle agreement.

> F. JAVA TECHNOLOGY RESTRICTIONS. You may not create, modify, or change the behavior of, or authorize your licensees 
> to create, modify, or change the behavior of, classes, interfaces, or subpackages that are in any way identified as 
> "java", "javax", "sun", “oracle” or similar convention as specified by Oracle in any naming convention designation.

The JSR-305 group has not defined any official releases according to its 
[JSR page](https://jcp.org/en/jsr/detail?id=305) so the only implementations is a seemingly random implementation 
provided by the FindBugs team. 
Even if the Findbugs team were experts on the JSR (which some where) they are not official as there has been no vote 
and are not available from the JSR hompage - so the `javax` package name restriction still applies.
