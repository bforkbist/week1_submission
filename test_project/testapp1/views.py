from django.shortcuts import render

# Create your views here.
from django.http import HttpResponse


def index(request):
    return HttpResponse("Hey!! riyaz")

def hello(request):
    context= {'tag_var' : 'tag_var' }
    return render(request,'index.html',context)
