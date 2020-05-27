# simplest possible hello world with eureka and zuul

## service roles:
| service name  | role  |
|---|---|
| eureka | automatic service register |
| zuul | proxy/load balancer |
| client1  | service hosting HTTP resource |

instead of dealing with which instances of which services will answer your request, 
like `server1:port2/resourcePath3` (you can see how this can get messy), 
using eureka + zuul you can just call `zuulIP:zuulPort/clientName/resourcePath3` 
and it will roundRobin between all `clientName` online instances. Also new instances of `clientName`
will be automatically recognized by eureka and made available for requests proxied by zuul.

For this example, only one instance of one service was used (sorry for the hello world'ish example), 
but the configuration pattern remains the same :)
