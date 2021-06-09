using Bag.GraphQL.GraphQL;
using HotChocolate;
using HotChocolate.AspNetCore.Voyager;
using Microsoft.AspNetCore.Builder;
using Microsoft.AspNetCore.Hosting;
using Microsoft.Extensions.DependencyInjection;
using Microsoft.Extensions.Hosting;

namespace Bag.GraphQL
{
    public class Startup
    {
        // This method gets called by the runtime. Use this method to add services to the container.
        // For more information on how to configure your application, visit https://go.microsoft.com/fwlink/?LinkID=398940
        public void ConfigureServices(IServiceCollection services)
        {
            services.AddGraphQLServer()
                //.AddQueryType<Query>()

                .AddDocumentFromFile("./schema.graphql")
                .BindComplexType<Query>()
                .BindComplexType<Adres>()
                .BindComplexType<AdresseerbaarObject>()
                .BindComplexType<Pand>()

                .AddSpatialTypes()
                .AddFiltering()
                .AddSpatialFiltering()
                .AddSorting()
                ;
        }

        // This method gets called by the runtime. Use this method to configure the HTTP request pipeline.
        public void Configure(IApplicationBuilder app, IWebHostEnvironment env)
        {
            if (env.IsDevelopment())
            {
                app.UseDeveloperExceptionPage();
            }

            app.UseRouting();
            app.UseVoyager();

            app.UseEndpoints(endpoints =>
            {
                endpoints
                    .MapGraphQL();
            });
        }
    }
}
