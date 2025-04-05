Proxy

**What problem was solved?**  
The proxy addressed slow performance by preventing high-res images from loading until needed and enforced security by allowing only logged-in agents to modify images.

**How did the pattern simplify or optimize the design?**  
It decoupled thumbnail display from heavy image loading, reducing resource use and improving responsiveness while also isolating access control, resulting in a cleaner, more maintainable architecture.


Flyweight

**What problem was solved?**  
The issue was excessive memory usage from each marker holding its own duplicate style data in a map application with thousands of markers.

**How did the pattern simplify or optimize the design?**  
The Flyweight Pattern separates shared style information from unique marker data, allowing one style instance to be reused for many markers. This approach reduces memory consumption and makes the system easier to maintain and scale.
